package progetto.bigdata.sparkjobexecutor.models;

public class ReviewsNumberItem {

    private String numReviews;
    private String indirizzo;
    private String punteggio;
    private String nomeHotel;

    private String latitudine;
    private String longitudine;

    public ReviewsNumberItem(String numReviews, String indirizzo, String nomeHotel, String punteggio, String lat, String lon){
        this.numReviews=numReviews;
        this.indirizzo = indirizzo;
        this.punteggio=punteggio;
        this.nomeHotel=nomeHotel;
        latitudine = lat;
        longitudine = lon;
    }

    public String getNumReviews(){
        return numReviews;
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
