package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.CoppiaHotelNumRecensioni;

public enum CoppieHotel_NegReviews implements Query<CoppiaHotelNumRecensioni> {

    INSTANCE{
        @Override
        public CoppiaHotelNumRecensioni build(String line) {
            String[] tokens = line.substring(1,line.length()-1).split(",");
            return new CoppiaHotelNumRecensioni(tokens[1], Integer.valueOf(tokens[0]));
        }
    }
}
