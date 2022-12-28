package progetto.bigdata.sparkjobexecutor.models;

public class WordCountItem {

    private String word;
    private long counter;

    public WordCountItem(String word, long counter){
        this.word = word;
        this.counter = counter;
    }

    public String getWord(){
        return word;
    }
    public long getCounter(){
        return counter;
    }
}
