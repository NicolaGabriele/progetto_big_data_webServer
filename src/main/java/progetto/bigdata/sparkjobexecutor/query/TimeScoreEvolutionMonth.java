package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.TimeScoreItem;

public enum TimeScoreEvolutionMonth implements Query<TimeScoreItem> {

    INSTANCE {

        @Override
        public TimeScoreItem build(String line) {
            String s = line.substring(1,line.length()-1);
            String[] tokens = s.split(",");
            if(tokens.length>1)
                return new TimeScoreItem(tokens[0], Double.valueOf(tokens[1]));
            return null;
        }

    }

}
