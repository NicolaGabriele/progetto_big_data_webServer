package progetto.bigdata.sparkjobexecutor.query;


import progetto.bigdata.sparkjobexecutor.models.GeoDataClass;

public enum GeoDataHotelsInNation implements Query<GeoDataClass> {
    ISTANCE {
        @Override
        public GeoDataClass build(String line){
            String s = line.substring(1,line.length()-1);
            String[] aux = s.split(",");
            return new GeoDataClass(aux[0],aux[1],aux[2],aux[3],aux[4]);
        }
    }
}
