package Command;

import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: Createcommand
 * @author: sun
 * @Description: 创建
 * @Date: 2021/4/22 13:53
 * @Version: 1.0
 */
public class Createcommand implements Command{

    BoardScreen boardScreen;
    Createcommand(BoardScreen boardScreen){
        this.boardScreen=boardScreen;
    }


    @Override
    public String get() {
        return "Create";
    }

    @Override
    public void execute() {
        boardScreen.create();

    }
}
