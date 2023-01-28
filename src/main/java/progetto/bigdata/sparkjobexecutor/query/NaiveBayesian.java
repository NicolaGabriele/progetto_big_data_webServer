package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.NaiveBayesItem;
import progetto.bigdata.sparkjobexecutor.models.WordCountItem;

public enum NaiveBayesian implements Query<NaiveBayesItem> {

    INSTANCE {
        @Override
        public NaiveBayesItem build(String line) {
            String s = line.substring(1, line.length() - 1);
            String[] tokens = s.split(",");
            if (tokens.length > 1) {
                String prob1 = tokens[1];
                String prob2 = tokens[2];
                double pr1 = Double.valueOf(prob1.split("\\[")[1]);
                double pr2 = Double.valueOf(prob1.split("]")[0]);
                double[] arr = {pr1, pr2};
                return new NaiveBayesItem(Double.valueOf(tokens[0]), arr);
            }
            return null;
        }
    }
}
