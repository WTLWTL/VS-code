import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JMenu;
public class ClinicMenu extends JFrame{
    private JPanel jContentPane = null;
    private JMenuBar jJMenuBar = null;
    private JMenu jMenu1 = null;
    private JMenuItem jMenuItem1 = null;
    private JMenuBar getJJMenuBar(){//初始化菜单栏jMenuBar
        if(jJMenuBar == null)
        {
            jJMenuBar = new JMenuBar();
            jJMenuBar.add(getJMenu1());//在菜单栏jMenuBar上添加菜单项jMenu1
        }
        return jJMenuBar;
    }
    private JMenu getJMenu1(){//初始化菜单jMenu
        if(jMenu1 == null){
            jMenu1 = new JMenu();
            jMenu1.setText("患者资料");//设置菜单jMenu1的标题
            jMenu1.add(getJMenuItem1()); //在菜单jMenu上添加菜单项jMenuItem1
        }
        return jMenu1;
    }
    private JMenuItem getJMenuItem1(){//初始化jMenu菜单中的菜单项jMenuItem1
        if(jMenuItem1 == null){
            jMenuItem1 = new JMenuItem();
            jMenuItem1.setText("当前患者信息");//设置菜单项jMenuItem1的标题
        }
        return jMenuItem1;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                ClinicMenu thisClass = new ClinicMenu();//生成一个Clinic类的对象
                thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thisClass.setVisible(true);
            }
        });
    }
    public ClinicMenu(){
        super();
        initialize();
    }
    private void initialize(){//初始化框架窗口this
        this.setSize(300,200);
        this.setJMenuBar(getJJMenuBar());//添加菜单栏到框架窗口(this)上
        this.setContentPane(getContentPane());//获取窗口的内容面板
        this.setTitle("儿童门诊医生诊疗操作");//设置框架窗口标题
    }
    private JPanel getJContentPane(){//初始化框架窗口的内容面板jContentPane
        if(jContentPane == null){
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
        }
        return jContentPane;
    }
}

