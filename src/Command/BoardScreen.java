package Command;

import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Command
 * @ClassName: BoardScreen
 * @author: sun
 * @Description: 具体操作
 * @Date: 2021/4/22 13:46
 * @Version: 1.0
 */
public class BoardScreen {
    public ArrayList<String> name=new ArrayList<>();
    public void open(){
        System.out.println("打开文件");
        name.add("open");
    }

    public void create(){
        System.out.println("创建文件");
        name.add("create");
    }
    public void copy(){
        System.out.println("复制文件");
        name.add("copy");
    }

    public void paste(){
        System.out.println("粘贴文件");
        name.add("paste");
    }
    public void undo(String name){
        System.out.println("撤销"+name+"操作");
    }
    public void setName(ArrayList<String> name){
        this.name=name;
    }
}
