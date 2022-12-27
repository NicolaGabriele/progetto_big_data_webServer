package progetto.bigdata.sparkjobexecutor.models;


import java.io.Serializable;

public class GeoDataClass  {
    private String latitudine;
    private String longitudine;

    public GeoDataClass(String lat, String lon){
        latitudine = lat;
        longitudine = lon;
    }

    public String getLatitudine(){
        return latitudine;
    }
    public String getLongitudine(){
        return longitudine;
    }
}
