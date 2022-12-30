package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.FilteredItem;
import progetto.bigdata.sparkjobexecutor.models.ReviewsNumberItem;

public enum ReviewsNumberFilter implements Query<ReviewsNumberItem> {

    INSTANCE{
        @Override
        public ReviewsNumberItem build(String line) {
            String[] tokens = line.substring(1,line.length()-1).split(",");
            return new ReviewsNumberItem(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
        }
    }
}
