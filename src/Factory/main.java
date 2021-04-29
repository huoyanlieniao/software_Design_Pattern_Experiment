package Factory;

/**
 * @author sun
 * @title: main
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/298:23
 */
public class main {
    public static void main(String[] args) {
        LogFactory logFactory;
        Log log;
        Client client=new Client();

        logFactory=new FileLogFactory();
        log=logFactory.createLog();

        log.writeLog("aaaaaa");



    }
}
