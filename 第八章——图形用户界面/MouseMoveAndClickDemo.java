import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
//重写MouseListener事件接口
public class MouseMoveAndClickDemo extends JFrame{
    JLabel MyLabel1;
    JButton myButton1;
    int i=0;
    public MouseMoveAndClickDemo(){
        super("事件处理");
        setBounds(50,50,310,120);
        setLayout(null);
        setVisible(true);
        MyLabel1 = new JLabel("什么都没有发生!");
        myButton1 = new JButton("鼠标移动过来");
        add(MyLabel1);
        add(myButton1);
        MyLabel1.setBounds(50,0,200,30);
        myButton1.setBounds(50,30,200,30);
        myButton1.addMouseListener(new myButton1());//注册事件对象监听者
    }
    //在注册为监听者的容器中，重新定义接口中的相应方法来处理事件
    class myButton1 implements MouseListener{//重写MouseListener接口
        //在注册为监听者的容器中，重新定义接口中的相应方法来处理事件
    public void mousePressed(MouseEvent e){
        MyLabel1.setText("您已压下鼠标按钮");
    }
    public void mouseReleased(MouseEvent e){
        MyLabel1.setText("你已经放开鼠标按钮");
    }
    public void mouseEntered(MouseEvent e){
        MyLabel1.setText("鼠标光标进入按钮");
    }
    public void mouseExited(MouseEvent e){
        MyLabel1.setText("鼠标光标离开按钮");
    }
    public void mouseClicked(MouseEvent e){
        i++;
        MyLabel1.setText("你已经按下按钮"+i+"次！");
    }
}
    public static void main(String[] args){
        MouseMoveAndClickDemo f = new MouseMoveAndClickDemo();
    }
}