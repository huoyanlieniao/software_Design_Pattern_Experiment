package Command;



import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: Pastecommand
 * @author: sun
 * @Description: 粘贴
 * @Date: 2021/4/22 13:46
 * @Version: 1.0
 */
public class Pastecommand implements Command{

    BoardScreen boardScreen;
    Pastecommand(BoardScreen command){
        this.boardScreen=command;
    }

    @Override
    public String get() {
        return "Paste";
    }
    @Override
    public void execute() {
          boardScreen.paste();

    }


}
