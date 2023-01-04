package progetto.bigdata.sparkjobexecutor.models;

public class CoppiaNazionalitàClientePunteggioMedio {

    private String nazionalità;
    private float punteggioMedio;

    public CoppiaNazionalitàClientePunteggioMedio(String nazionalità, float punteggioMedio){
        this.nazionalità = nazionalità;
        this.punteggioMedio = punteggioMedio;
    }

    public String getNazionalità(){
        return nazionalità;
    }

    public float getPunteggioMedio(){
        return punteggioMedio;
    }
}
