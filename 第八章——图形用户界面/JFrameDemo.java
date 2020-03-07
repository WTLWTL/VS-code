import javax.swing.*;
public class JFrameDemo extends JFrame{
    public JFrameDemo(){
        super("JFrame");
        setBounds(50,50,300,120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        this.add(new JButton("GUI"));
    }
    public static void main(String[] args) {
        JFrameDemo f = new JFrameDemo();   
    }
}
