package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.FilteredItem;

public enum AverageScoreFilter implements Query<FilteredItem> {

    INSTANCE{
        @Override
        public FilteredItem build(String line) {
            String[] tokens = line.substring(1,line.length()-1).split(",");
            return new FilteredItem(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4]);
        }
    }
}
