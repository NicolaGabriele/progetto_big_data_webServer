package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.CoppiaHotelPunteggioMedio;

import java.util.List;

public enum CoppieHotelPunteggioMedioPerNazione implements Query<CoppiaHotelPunteggioMedio>{

    INSTANCE {
        @Override
        public CoppiaHotelPunteggioMedio build(String line) {
            String s = line.substring(1,line.length()-1);
            String[] tokens = s.split(",");
            return new CoppiaHotelPunteggioMedio(tokens[0],Double.valueOf(tokens[1]));
        }
    }
}
