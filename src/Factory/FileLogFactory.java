package Factory;

/**
 * @author sun
 * @title: FileLogFactory
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/298:16
 */
public class FileLogFactory implements LogFactory{
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
