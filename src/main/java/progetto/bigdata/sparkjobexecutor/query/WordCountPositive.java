package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.WordCountItem;


public enum WordCountPositive implements Query<WordCountItem> {

    INSTANCE {
        @Override
        public WordCountItem build(String line){
            String s = line.substring(1,line.length()-1);
            String[] tokens = s.split(",");
            return new WordCountItem(tokens[1], Long.valueOf(tokens[0]));
        }
    }
}
