package progetto.bigdata.sparkjobexecutor.models;

public class TimeScoreItem {

    private String data;
    private double punteggio;

    public TimeScoreItem(String data, double punteggio){
        this.data = data;
        this.punteggio = punteggio;
    }

    public String getData(){
        return data;
    }
    public double getPunteggio(){
        return punteggio;
    }
}
