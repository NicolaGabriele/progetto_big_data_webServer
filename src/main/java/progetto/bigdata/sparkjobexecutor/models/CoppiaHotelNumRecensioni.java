package progetto.bigdata.sparkjobexecutor.models;

public class CoppiaHotelNumRecensioni {
    private String hotel;
    private int numRecensioni;

    public CoppiaHotelNumRecensioni(String hotel, int numRecensioni){
        this.hotel=hotel;
        this.numRecensioni = numRecensioni;
    }

    public String getHotel(){
        return  hotel;
    }

    public int getNumRecensioni(){
        return numRecensioni;
    }
}
