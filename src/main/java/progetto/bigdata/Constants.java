package progetto.bigdata;

import java.io.File;

public interface Constants {

    String SPARK_HOME = "C:\\spark-3.3.1-bin-hadoop3",
            APP_JAR ="C:\\Users\\Nicola\\progettoBigData\\progettoBigData\\target\\scala-2.13\\progettobigdata_2.13-0.1.0-SNAPSHOT.jar",
            MASTER = "local[*]",
            RESULTS_HOME = "C:\\Users\\Nicola\\progettoBigData\\progettoBigData\\results\\result";

    static String buildFileName(int i){
        StringBuilder sb = new StringBuilder().append(String.valueOf(i));
        while(sb.length()<5)
            sb.insert(0,'0');
        sb.insert(0,"part-");
        return sb.toString();
    }

    static void deleteResultDir(){
        File directory = new File(RESULTS_HOME);
        if(directory.exists()) {
            for (File f : directory.listFiles())
                f.delete();
            directory.delete();
        }
    }
}
