import javax.swing.*;
import java.awt.event.*;
public class LoginDemo extends JFrame{
    public LoginDemo(){
        super("登录");
        setBounds(50,50,190,170);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        JLabel l1 = new JLabel("姓名：");
        JLabel l2 = new JLabel("密码：");
        JTextField t1 = new JTextField("张三");
        JTextField t2 = new JTextField("**********");
        JButton B1 = new JButton("登录");
        JButton B2 = new JButton("退出");
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(B1);
        add(B2);
        l1.setBounds(0,0,50,30);
        l2.setBounds(0,50,50,30);
        t1.setBounds(40,0,130,30);
        t2.setBounds(40,50,130,30);
        B1.setBounds(0,100,70,30);
        B2.setBounds(100,100,70,30);
        B2.addActionListener(new B2());//添加监听
    }
    class B2 implements ActionListener{//监听器接口
        public void actionPerformed(ActionEvent e){
            System.exit(0);//退出系统
        }
    }
    public static void main(String[] args) {
        LoginDemo f = new LoginDemo();
    }
}