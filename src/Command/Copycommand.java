package Command;

import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: Copycommand
 * @author: sun
 * @Description: 复制
 * @Date: 2021/4/22 13:54
 * @Version: 1.0
 */
public class Copycommand implements Command{
    BoardScreen boardScreen;

    Copycommand(BoardScreen boardScreen){
        this.boardScreen=boardScreen;
    }


    @Override
    public void execute() {
        boardScreen.copy();
    }

    @Override
    public String get() {
        return "Copy";
    }
}
