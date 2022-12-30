package progetto.bigdata.sparksubmitserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import progetto.bigdata.Constants;
import progetto.bigdata.sparkjobexecutor.models.*;
import progetto.bigdata.sparkjobexecutor.query.*;

import java.util.List;

/*
    autore: Nicola
    gestore di chiamate http, ancora da decidere se fare un controller per ogni query e come strutturare
 */
@RestController
public class Controller {


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

    @GetMapping("/recensioniHotelDallaData")
    public @ResponseBody List<String> recensioniHotelDallaData(@RequestParam String hotel, @RequestParam String days){
        String[] params = {hotel, days};
        Constants.deleteResultDir();
        return RecensioniHotelDallaData.INSTANCE.compute(params);
    }

    @GetMapping("/coppieHotel_NegReviews")
    public @ResponseBody List<CoppiaHotelNumRecensioni> coppieHotel_NegReviews(){
        Constants.deleteResultDir();
        return CoppieHotel_NegReviews.INSTANCE.compute(null);
    }

    @GetMapping("/coppieHotel_PosReviews")
    public @ResponseBody List<CoppiaHotelNumRecensioni> coppieHotel_PosReviews(){
        Constants.deleteResultDir();
        return CoppieHotel_PosReviews.INSTANCE.compute(null);
    }

    @GetMapping("/averageScoreFilter")
    public @ResponseBody List<FilteredItem> averageScoreFilter(@RequestParam String punteggio){
        String[] params = {punteggio};
        Constants.deleteResultDir();
        return AverageScoreFilter.INSTANCE.compute(params);
    }
}
