import java.awt.*;
import javax.swing.*;
public class GridLayDemo extends JFrame{
	private String names[]={"��ť1","��ť2","��ť3","��ť4","��ť5","��ť6"};
	public GridLayDemo(){
		super("���񲼾�");
		setBounds(50,50,300,120);
		setLayout(new GridLayout(3,3));//���������������񲼾�
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		for(int i=0;i<names.length;i++){
			add(new JButton(names[i]));//������Ӹ�����ť
		}
	}
	public static void main(String[] args)
	{
		GridLayDemo f=new GridLayDemo();
	}
}