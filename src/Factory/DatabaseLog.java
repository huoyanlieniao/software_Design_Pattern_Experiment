package Factory;

/**
 * @author sun
 * @title: DatabaseLog
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/298:19
 */
public class DatabaseLog implements Log{
    @Override
    public void writeLog(String s) {
        System.out.println("DatabaseLog write"+s);
    }
}
