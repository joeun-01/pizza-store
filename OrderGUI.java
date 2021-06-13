package termProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OrderGUI {
	public static void main(String[] args) {

		// TODO 부모 프레임 생성 및 기본 스타일 지정 실시
		JFrame frm = new JFrame("피자 주문");
		setJFrameStyle(frm);

		// TODO 자식 레이아웃 [음식 주문 내역] 생성 실시
		JLabel food_txt = new JLabel("피자");
		food_txt.setBounds(0, 0, 100, 50); // TODO setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		setJLabelStyle(food_txt);

		String food_arr[] = { "페페로니 피자", "치즈 피자", "불고기 피자", "쉬림프 피자" };
		JComboBox<String> food_combo = new JComboBox<String>(food_arr);
		food_combo.setBounds(100, 0, 300, 50); // TODO setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		setJComboBoxStyle(food_combo);

		JButton food_add_btn = new JButton("음식추가");
		food_add_btn.setBounds(400, 0, 100, 50); // TODO setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		setJButtonStyle(food_add_btn); // 기본 버튼 스타일 지정 메소드 호출

		// TODO 자식 레이아웃 [음료 주문 내역] 생성 실시
		JLabel drink_txt = new JLabel("음료");
		drink_txt.setBounds(0, 55, 100, 50); // TODO setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		setJLabelStyle(drink_txt);

		String drink_arr[] = { "사이다", "콜라", "환타", "맥주" };
		JComboBox<String> drink_combo = new JComboBox<String>(drink_arr);
		drink_combo.setBounds(100, 55, 300, 50); // TODO setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		setJComboBoxStyle(drink_combo);

		JButton drink_add_btn = new JButton("음료추가");
		drink_add_btn.setBounds(400, 55, 100, 50); // TODO setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		setJButtonStyle(drink_add_btn); // 기본 버튼 스타일 지정 메소드 호출

		// TODO 자식 레이아웃 [테이블] 생성
		String tittleArray[] = { "주문내역", "가격" };
		DefaultTableModel model = new DefaultTableModel(tittleArray, 0);
		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.getViewport().setBackground(Color.LIGHT_GRAY); // JScrollPane에 배경색 지정
		scrollPane.setBounds(0, 110, 500, 285); // TODO setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		ArrayList pay_list = new ArrayList(); // 결제 금액 관련 리스트 선언

		// TODO 자식 레이아웃 [결제 및 삭제 버튼] 생성
		JButton pay_btn = new JButton("결제");
		setJButtonStyle(pay_btn); // 기본 버튼 스타일 지정 메소드 호출

		JButton del_btn = new JButton("삭제");
		setJButtonStyle(del_btn); // 기본 버튼 스타일 지정 메소드 호출

		JPanel btn_flow_panel = new JPanel();
		btn_flow_panel.setLayout(new FlowLayout()); // 가운데 중심 배치 레이아웃 (윈도우창 크기를 벗어나면 자동 줄바꿈 실시)
		btn_flow_panel.add(pay_btn);
		btn_flow_panel.add(del_btn);
		btn_flow_panel.setBackground(Color.LIGHT_GRAY);
		btn_flow_panel.setBounds(0, 400, 500, 100); // setBounds(가로위치, 세로위치, 가로길이, 세로길이);

		// TODO 자식 레이아웃 [버튼] 클릭 이벤트 정의 실시
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getActionCommand().equals("음식추가")) { // 음식 추가 버튼 클릭이벤트 처리
					// TODO 입력된 값 테이블에 추가하기
					String info[] = new String[2]; // 한행 (row) 에 저장할 데이터 모음
					info[0] = food_combo.getSelectedItem().toString(); // 콤보박스 값을 가져온다
					info[1] = "5000";
					model.addRow(info); // 테이블 모델에 데이터 삽입 실시
					pay_list.add(food_combo.getSelectedItem().toString() + " : " + "5000"); // 결제 금액 리스트에 추가
				} else if (e.getActionCommand().equals("음료추가")) { // 음식 추가 버튼 클릭이벤트 처리
					// TODO 입력된 값 테이블에 추가하기
					String info[] = new String[2]; // 한행 (row) 에 저장할 데이터 모음
					info[0] = drink_combo.getSelectedItem().toString(); // 콤보박스 값을 가져온다
					info[1] = "3000";
					model.addRow(info); // 테이블 모델에 데이터 삽입 실시
					pay_list.add(drink_combo.getSelectedItem().toString() + " : " + "3000"); // 결제 금액 리스트에 추가
				} else if (e.getActionCommand().equals("결제")) { // 결제 버튼 클릭이벤트 처리
					/** TODO [질문 알림창] */
					int qut_data = JOptionPane.showConfirmDialog(frm, "주문을 결제하시겠습니까??", "주문내역",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (qut_data == 0) { // [예] 버튼
						System.out.println(pay_list.toString());
						JOptionPane.showMessageDialog(frm, "결제되었습니다." + "\n" + "[주문내역]\n" + pay_list.toString());
					} else if (qut_data == 1) { // [아니오] 버튼

					} else if (qut_data == 2) { // [취소] 버튼

					}

				} else if (e.getActionCommand().equals("삭제")) { // 삭제 버튼 클릭이벤트 처리
					// 선택한 줄(row)의 번호 알아내기
					int rowIndex = table.getSelectedRow();

					// 선택 안하고 누를 경우 리턴값 -1
					if (rowIndex == -1) {
						return;
					}
					model.removeRow(rowIndex); // 해당 테이블 행 삭제
					pay_list.remove(rowIndex); // 결제 금액 리스트에서도 삭제 실시
				}
			}
		};
		food_add_btn.addActionListener(action);
		drink_add_btn.addActionListener(action);
		pay_btn.addActionListener(action);
		del_btn.addActionListener(action);

		// TODO 부모 프레임에다가 자식 컴포넌트 추가
		frm.getContentPane().add(food_txt);
		frm.getContentPane().add(food_combo);
		frm.getContentPane().add(food_add_btn);

		frm.getContentPane().add(drink_txt);
		frm.getContentPane().add(drink_combo);
		frm.getContentPane().add(drink_add_btn);

		frm.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frm.getContentPane().add(btn_flow_panel);

		// TODO 부모 프레임이 보이도록 설정
		frm.setVisible(true);
		
	}

	// TODO JFrame 부모 기본 스타일 지정 메소드
	public static void setJFrameStyle(JFrame frame) {
		// TODO 부모 프레임 크기 설정 (가로, 세로) 및 배경색 지정
		frame.setSize(500, 500);
		frame.setBackground(Color.BLACK);
		// TODO 부모 프레임을 화면 가운데에 배치
		frame.setLocationRelativeTo(null);
		// TODO 부모 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO 부모 프레임 창 크기 고정 실시
		frame.setResizable(false);
		// TODO 부모 레이아웃 설정
		frame.getContentPane().setLayout(null);
	}

	// TODO JLabel 기본 스타일 지정 메소드
	public static void setJLabelStyle(JLabel txt) {
		txt.setOpaque(true); // TODO setBackground 적용하기 위한 선행 설정
		txt.setBackground(Color.GRAY); // TODO 백그라운드 색상 정의
		txt.setForeground(Color.WHITE); // TODO 텍스트 색상 정의
		txt.setFont(new Font("맑은 고딕", 0, 15)); // TODO 폰트 정의
		txt.setHorizontalAlignment(JLabel.CENTER); // TODO 텍스트 센터 표시 설정
	}

	// TODO JComboBox 기본 스타일 지정 메소드
	public static void setJComboBoxStyle(JComboBox combo) {
		combo.setBackground(Color.LIGHT_GRAY); // TODO 백그라운드 색상 정의
		combo.setForeground(Color.WHITE); // TODO 텍스트 색상 정의
		combo.setFont(new Font("맑은 고딕", 0, 15)); // TODO 폰트 정의
	}

	// TODO JButton 기본 스타일 지정 메소드
	public static void setJButtonStyle(JButton btn) {
		btn.setBackground(Color.DARK_GRAY); // TODO 백그라운드 색상 정의
		btn.setForeground(Color.WHITE); // TODO 텍스트 색상 정의
		btn.setFont(new Font("맑은 고딕", 0, 15)); // TODO 폰트 정의
		btn.setHorizontalAlignment(JLabel.CENTER); // TODO 텍스트 센터 표시 설정
	}

}
