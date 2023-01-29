package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.TimeScoreItem;
import progetto.bigdata.sparkjobexecutor.models.WordCountItem;

public enum TimeScoreEvolution implements Query<TimeScoreItem> {

    INSTANCE {

        @Override
        public TimeScoreItem build(String line) {
            String[] tokens = line.split(",");
            if(tokens.length>1)
                return new TimeScoreItem(tokens[0], Double.valueOf(tokens[1]));
            return null;
        }

    }

}
