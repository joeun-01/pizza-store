package termproject;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Welcome extends JFrame {
	
	JPanel panel = new JPanel();
	JButton button1 = new JButton("��");
	JButton button2 = new JButton("������");
	
	
	public Welcome(){
		setTitle("�����ֹ�");
		setSize(500,500);
		setDefaultCloseOperation(3); //â�ݱ�Ŭ���ϸ� ���α׷� ����
		
		
		panel.add(button1);
		panel.add(button2);

		add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Welcome first = new Welcome();
		
	}

}
