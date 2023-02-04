package progetto.bigdata.sparkjobexecutor.models;

public class CoppiaNazionalitàClientePunteggioMedio {

    private String nazionalita;
    private double punteggioMedio;

    public CoppiaNazionalitàClientePunteggioMedio(String nazionalita, double punteggioMedio){
        this.nazionalita = nazionalita;
        this.punteggioMedio = punteggioMedio;
    }

    public String getNazionalita(){
        return nazionalita;
    }

    public double getPunteggioMedio(){
        return punteggioMedio;
    }
}
