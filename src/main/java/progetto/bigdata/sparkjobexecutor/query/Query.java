package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.Constants;
import progetto.bigdata.sparkjobexecutor.SparkJob;
import progetto.bigdata.sparkjobexecutor.models.GeoDataClass;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import static progetto.bigdata.Constants.RESULTS_HOME;
import static progetto.bigdata.Constants.buildFileName;

public interface Query<T> {

    default List<T> compute(String[] args){
        String className = this.getClass().getName();
        String newClassName = className.substring(0,className.length()-2);
        try {
            SparkJob.runSparkJob(newClassName, args);
            return aggregateFromFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //legge dal file risultato e dopo lo cancella
    private List<T> aggregateFromFile(){
        List<T> ret = new LinkedList<>();
        int i = 0;
        File cor = new File(RESULTS_HOME+"\\"+buildFileName(i));
        while(cor.exists()){
            read(ret,cor);
            i++;
            cor = new File(RESULTS_HOME+"\\"+buildFileName(i));
        }
        return ret;
    }

    private void read(List<T> ret, File f){
        try{
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(f))
            );
            String line = br.readLine();
            while (line != null) {
                T elem = build(line);
                if(elem != null)
                    ret.add(build(line));
                line = br.readLine();
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    T build(String line);
}
