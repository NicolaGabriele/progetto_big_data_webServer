package progetto.bigdata.sparksubmitserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import progetto.bigdata.sparkjobexecutor.*;
import progetto.bigdata.sparkjobexecutor.models.GeoDataClass;

import java.io.IOException;

@RestController
public class Controller {

    @GetMapping("/prova")
    public @ResponseBody int prova(){
        try {
            return SparkJob.runSparkJob();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
