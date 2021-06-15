package termProject;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

public class StartScreen extends JFrame {

	JPanel panel = new JPanel();
	JButton button1 = new JButton("Consumer");
	JButton button2 = new JButton("Manager");

	public StartScreen() {
		setTitle("Pizza order");
		setSize(500, 150);
		setDefaultCloseOperation(3); // 창닫기클릭하면 프로그램 종료

		panel.add(button1);
		panel.add(button2);

		add(panel);

		setLocationRelativeTo(null);

		setVisible(true);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Consumer();
				setVisible(false);
			}
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new CheckStock();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				setVisible(false);
			}
		});
	}

	public static void main(String[] args) {
		StartScreen welcome = new StartScreen();
	}

}