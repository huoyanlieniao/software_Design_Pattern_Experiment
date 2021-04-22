package Command;

import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: Undo
 * @author: sun
 * @Description: 撤销
 * @Date: 2021/4/22 15:23
 * @Version: 1.0
 */
public class Undo implements Command{
    ArrayList<String> name;
    BoardScreen boardScreen;

    Undo(BoardScreen command){
        this.boardScreen=command;
    }

    @Override
    public void execute() {
        this.name=boardScreen.name;
            if(name.size()>0){
                int m=name.size();
                String string = name.get(m-1);
                boardScreen.undo(string);
                name.remove(m-1);
                boardScreen.setName(name);
            }else{
                System.out.println("没有要撤销操作");
            }
    }

    @Override
    public String get() {
        return "";
    }
}
