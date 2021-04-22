package Command;

import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: Command
 * @author: sun
 * @Description: command接口
 * @Date: 2021/4/22 13:41
 * @Version: 1.0
 */
public interface Command {
    public abstract void execute();
    public abstract String  get();
}
