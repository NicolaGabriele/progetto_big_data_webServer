package progetto.bigdata.sparkjobexecutor;

import java.io.IOException;
import org.apache.spark.launcher.*;
public class SparkJob {


    public static int runSparkJob() throws IOException, InterruptedException{
        Process spark = new SparkLauncher()
                .setSparkHome("C:\\spark-3.3.1-bin-hadoop3")
                .setAppResource("C:\\Users\\Nicola\\progettoBigData\\proveVarieSpark\\target\\scala-2.13\\provevariespark_2.13-0.1.0-SNAPSHOT.jar")
                .setMainClass("prova")
                .setMaster("local[*]")
                .addAppArgs("Italy")
                .launch();
        new InputPrinter(spark.getInputStream()).start();
        new InputPrinter(spark.getErrorStream()).start();
        int exit = spark.waitFor();
        return exit;
    }

}
