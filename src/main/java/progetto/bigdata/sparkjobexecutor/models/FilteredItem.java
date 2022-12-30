package progetto.bigdata.sparkjobexecutor.models;

public class FilteredItem {

    private String indirizzo;
    private String punteggio;
    private String nomeHotel;

    private String latitudine;
    private String longitudine;

    public FilteredItem(String indirizzo, String nomeHotel, String punteggio, String lat, String lon){
        this.indirizzo = indirizzo;
        this.punteggio=punteggio;
        this.nomeHotel=nomeHotel;
        latitudine = lat;
        longitudine = lon;
    }

    public String getIndirizzo(){
        return indirizzo;
    }
    public String getPunteggio(){
        return nomeHotel;
    }
    public String getNomeHotel(){
        return punteggio;
    }
    public String getLatitudine(){
        return latitudine;
    }
    public String getLongitudine(){
        return longitudine;
    }

}
