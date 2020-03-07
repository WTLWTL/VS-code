import javax.swing.*;
public class NullDemo extends JFrame{
    private JLabel myLabel1;
    private JButton myButton1;
    public NullDemo(){
        super("自定义布局");//设置自定义布局
        setBounds(50,50,310,120);
        setLayout(null);
        setVisible(true);
        myLabel1 = new JLabel("什么都没发生!");
        myButton1 = new JButton("鼠标移动过来");
        add(myButton1);
        add(myLabel1);
        myLabel1.setBounds(50,0,200,30);
        myButton1.setBounds(50,30,200,30);//指定组件在容器中的位置和大小
    }
public static void main(String[] args){
    NullDemo f=new NullDemo();
}
}