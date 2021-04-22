package Command;


import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: Text
 * @author: sun
 * @Description: 文件菜单项
 * @Date: 2021/4/22 13:43
 * @Version: 1.0
 */
public class Text{
    public Command command;

    public void setCommand(Command command) {
        this.command=command;
    }

    public void click() {
        command.execute();

    }

}
