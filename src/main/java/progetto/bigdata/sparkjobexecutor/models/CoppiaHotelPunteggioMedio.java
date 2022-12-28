package progetto.bigdata.sparkjobexecutor.models;

public class CoppiaHotelPunteggioMedio {

    private String nomeHotel;
    private double punteggioMedio;

    public CoppiaHotelPunteggioMedio(String nomeHotel, double punteggioMedio){
        this.nomeHotel = nomeHotel;
        this.punteggioMedio = punteggioMedio;
    }

    public String getNomeHotel(){
        return nomeHotel;
    }

    public double getPunteggioMedio(){
        return punteggioMedio;
    }
}
