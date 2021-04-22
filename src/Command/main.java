package Command;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: main
 * @author: sun
 * @Description: 执行
 * @Date: 2021/4/22 13:56
 * @Version: 1.0
 */
public class main {

    public static void main(String[] args){
        //创建接受者
        BoardScreen boardScreen=new BoardScreen();
        //命令初始化
        Command command1=new Copycommand(boardScreen);
        Command command2=new Createcommand(boardScreen);
        Command command3=new Pastecommand(boardScreen);
        Command command4=new Opencommand(boardScreen);
        Command command5=new Undo(boardScreen);
        //请求者
        Edit edit=new Edit();
        Text text=new Text();

        //下命令
        edit.setCommand(command1);
        edit.click();
        edit.setCommand(command2);
        edit.click();
        edit.setCommand(command5);
        edit.click();
        edit.click();
        edit.click();



    }

}
