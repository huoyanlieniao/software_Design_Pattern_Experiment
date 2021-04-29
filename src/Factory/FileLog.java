package Factory;

/**
 * @author sun
 * @title: FileLog
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/298:17
 */
public class FileLog implements Log{
    @Override
    public void writeLog(String s) {
        System.out.println("FileLog wtite:"+s);
    }
}
