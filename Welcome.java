package termproject;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Welcome extends JFrame {
	
	JPanel panel = new JPanel();
	JButton button1 = new JButton("고객");
	JButton button2 = new JButton("관리자");
	
	
	public Welcome(){
		setTitle("피자주문");
		setSize(500,500);
		setDefaultCloseOperation(3); //창닫기클릭하면 프로그램 종료
		
		
		panel.add(button1);
		panel.add(button2);

		add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Welcome first = new Welcome();
		
	}

}
