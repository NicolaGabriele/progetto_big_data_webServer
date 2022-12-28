package progetto.bigdata.sparkjobexecutor;

import java.io.IOException;
import org.apache.spark.launcher.*;

import static progetto.bigdata.Constants.*;

/*
    autore: Nicola
    realizza il codice per eseguire un job spark, viene utilizzato dal controller

 */
public class SparkJob {


    public static int runSparkJob(String className, String[] args) throws IOException, InterruptedException{
        String[] tokens = className.split("\\.");
        SparkLauncher launcher = new SparkLauncher()
                .setSparkHome(SPARK_HOME)
                .setAppResource(APP_JAR)
                .setMainClass(tokens[tokens.length-1])
                .setMaster(MASTER);

        if(args != null)
            for(String arg: args)
                launcher.addAppArgs(arg);

        Process spark = launcher.launch();
        new InputPrinter(spark.getInputStream()).start();
        new InputPrinter(spark.getErrorStream()).start();
        int exit = spark.waitFor();
        return exit;
    }

}
