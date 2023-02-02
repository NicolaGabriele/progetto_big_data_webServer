package progetto.bigdata.sparkjobexecutor.models;


import java.io.Serializable;

public class GeoDataClass  {

    private String nome;

    private String indirizzo;

    private String score;
    private String latitudine;
    private String longitudine;

    public GeoDataClass(String nome, String indirizzo, String score, String lat, String lon){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.score = score;
        latitudine = lat;
        longitudine = lon;
    }

    public String getNome(){
        return nome;
    }
    public String getIndirizzo(){
        return indirizzo;
    }
    public String getScore(){
        return score;
    }
    public String getLatitudine(){
        return latitudine;
    }
    public String getLongitudine(){
        return longitudine;
    }
}
