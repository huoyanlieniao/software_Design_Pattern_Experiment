package Factory;

/**
 * @author sun
 * @title: Client
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/298:21
 */
public class Client {
    Log log;


    public void setLog(Log log) {
        this.log = log;
    }

    public void writeLog(String s){
        log.writeLog(s);

    }
}
