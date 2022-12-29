package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.WordCountItem;

import java.util.List;

public enum WordCountNegative implements Query<WordCountItem> {

    INSTANCE {
        //TODO
        @Override
        public WordCountItem build(String line) {
            String s = line.substring(1,line.length()-1);
            String[] tokens = s.split(",");
            if(tokens.length>1)
                return new WordCountItem(tokens[1], Long.valueOf(tokens[0]));
            return null;
        }

    }

}

