package Command;

import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: Edit
 * @author: sun
 * @Description: 编辑菜单项
 * @Date: 2021/4/22 13:44
 * @Version: 1.0
 */
public class Edit {
    public Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void click() {
        command.execute();

    }


}
