package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.CoppiaNazionalitàClientePunteggioMedio;

public enum DemandingClientsPerNationality implements Query<CoppiaNazionalitàClientePunteggioMedio> {

    INSTANCE {
        @Override
        public CoppiaNazionalitàClientePunteggioMedio build(String line) {
            String s = line.substring(1,line.length()-1);
            String[] tokens = s.split(",");
            return new CoppiaNazionalitàClientePunteggioMedio(tokens[0],Double.valueOf(tokens[1]));
        }
    }
}
