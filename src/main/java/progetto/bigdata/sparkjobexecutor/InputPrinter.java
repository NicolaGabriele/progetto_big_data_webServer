package progetto.bigdata.sparkjobexecutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputPrinter extends Thread{

    /*
        autore: Nicola
        classe ausiliaria che si occupa di stampare a video lo stack trace del job spark, serve per debugging
     */
    private InputStream s;
    public InputPrinter(InputStream s){
        this.s = s;
    }
    public void run(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){

        }
    }
}
