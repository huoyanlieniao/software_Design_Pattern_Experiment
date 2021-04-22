package Command;



import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: Opencommand
 * @author: sun
 * @Description: 打开
 * @Date: 2021/4/22 13:51
 * @Version: 1.0
 */
public class Opencommand implements Command{

    BoardScreen boardScreen;
    Opencommand(BoardScreen boardScreen){
        this.boardScreen=boardScreen;
    }
    @Override
    public String get() {
        return "Open";
    }
    @Override
    public void execute() {
      boardScreen.open();

    }
}
