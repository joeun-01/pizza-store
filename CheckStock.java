package termProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Container;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckStock {
	
	public CheckStock() throws IOException {

		String infileName = "order.txt"; // input file name

		Scanner inputStream = new Scanner(new FileInputStream(infileName)); // open file

		ArrayList<String> order = new ArrayList<String>(); 
		
		while (inputStream.hasNextLine()) {
			String line = inputStream.nextLine(); // read name
			order.add(line);
		}

		Order fileOrder = new Order(order);
		fileOrder.orderMenu();
		PrintStock print = new PrintStock(infileName);

		inputStream.close(); // file close

		JFrame panel = new JFrame();

		panel.setTitle("재고 확인");
		panel.setSize(500, 500);
		panel.setLocationRelativeTo(null);
		panel.setPreferredSize(new Dimension(300, 300));

		Container contentPane = panel.getContentPane();
		JLabel label = new JLabel(print.printMaterials(), SwingConstants.CENTER);
		contentPane.add(label);
		panel.setDefaultCloseOperation(3); // 창닫기클릭하면 프로그램 종료
		panel.pack();

		panel.setVisible(true);
	}
}