package progetto.bigdata;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public interface Constants {

    /*
        Attenzione!! sostituire con i propri path
     */
    String SPARK_HOME = "C:\\spark-3.3.1-bin-hadoop3",
            APP_JAR ="C:\\progettoBigData\\progettoBigData\\target\\scala-2.12\\progettobigdata_2.12-0.1.0-SNAPSHOT.jar",
            MASTER = "local[*]",
            RESULTS_HOME = "C:\\progettoBigData\\progettoBigData\\results\\result";

    static String buildFileName(int i){
        StringBuilder sb = new StringBuilder().append(String.valueOf(i));
        while(sb.length()<5)
            sb.insert(0,'0');
        sb.insert(0,"part-");
        return sb.toString();
    }

    static void deleteResultDir(){
        File directory = new File(RESULTS_HOME);
        try {
        if(directory.exists()) {
            for (String f : directory.list())
                java.nio.file.Files.delete(Path.of(RESULTS_HOME+"\\"+f));
            java.nio.file.Files.delete(Path.of(RESULTS_HOME));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
