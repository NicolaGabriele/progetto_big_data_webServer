package progetto.bigdata.sparksubmitserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import progetto.bigdata.Constants;
import progetto.bigdata.sparkjobexecutor.models.CoppiaHotelPunteggioMedio;
import progetto.bigdata.sparkjobexecutor.models.GeoDataClass;
import progetto.bigdata.sparkjobexecutor.models.WordCountItem;
import progetto.bigdata.sparkjobexecutor.query.CoppieHotelPunteggioMedioPerNazione;
import progetto.bigdata.sparkjobexecutor.query.GeoDataHotelsInNation;
import progetto.bigdata.sparkjobexecutor.query.WordCountNegative;
import progetto.bigdata.sparkjobexecutor.query.WordCountPositive;

import java.util.List;

/*
    autore: Nicola
    gestore di chiamate http, ancora da decidere se fare un controller per ogni query e come strutturare
 */
@RestController
public class Controller {

    //TODO

    @GetMapping("/geoDataHotelsInNation")
    public @ResponseBody List<GeoDataClass> geodataHotelsInNation(@RequestParam String nation){
        String[] params = {nation};
        Constants.deleteResultDir();
        return GeoDataHotelsInNation.ISTANCE.compute(params);
    }

    @GetMapping("/wordCountPositive")
    public @ResponseBody List<WordCountItem> wordCountPositive(){
        Constants.deleteResultDir();
        return WordCountPositive.INSTANCE.compute(null);
    }

    @GetMapping("/wordCountNegative")
    public @ResponseBody List<WordCountItem> wordCountNegative(){
        Constants.deleteResultDir();
        return WordCountNegative.INSTANCE.compute(null);
    }

    @GetMapping("/coppieHotelPunteggioMedioPerNazione")
    public @ResponseBody List<CoppiaHotelPunteggioMedio> coppieHotelPunteggioMedioPerNazione(@RequestParam String nation){
        String[] params = {nation};
        Constants.deleteResultDir();
        return CoppieHotelPunteggioMedioPerNazione.INSTANCE.compute(params);
    }


}
