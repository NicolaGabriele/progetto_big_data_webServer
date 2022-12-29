package progetto.bigdata.sparkjobexecutor.query;

import java.io.*;
import java.util.List;

public enum RecensioniHotelDallaData implements Query<String> {

    INSTANCE {
        @Override
        public String build(String line) {
            return null;
        }

        @Override
        public  void read(List<String> ret, File f){
            try{
                String s = "";
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                String line = br.readLine();
                while(line != null){
                    if(!line.equals(""))
                        s+=line;
                    else {
                        ret.add(s);
                        s="";
                    }
                    line = br.readLine();
                }
                br.close();
            }catch(IOException e){

            }
        }
    }
}
