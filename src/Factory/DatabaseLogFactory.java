package Factory;

/**
 * @author sun
 * @title: DatabaseLogFactory
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/298:21
 */
public class DatabaseLogFactory implements LogFactory{
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
