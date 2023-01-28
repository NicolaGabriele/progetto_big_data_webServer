package progetto.bigdata.sparkjobexecutor.models;

public class NaiveBayesItem {

    private double classe;
    private double[] probabilita;

    public NaiveBayesItem(double classe, double[] probabilita){
        this.classe = classe;
        this.probabilita = probabilita;
    }

    public double getClasse(){
        return classe;
    }
    public double[] getProbabilita(){
        return probabilita;
    }
}
