package termProject;

import java.util.ArrayList;

public class Calculation extends Order {
	public Calculation(ArrayList<String> payList) {
		super(payList);
		// TODO Auto-generated constructor stub
	}

	public int calculateSales() {
		int pepperoni_Sales = Pepperoni.PRICE * pepperoni_Count;
		int cheese_Sales = Cheese.PRICE * cheese_Count;
		int bulgogi_Sales = Bulgogi.PRICE * bulgogi_Count;
		int shrimp_Sales = Shrimp.PRICE * shrimp_Count;

		if (pepperoni_Count != 0) {
			System.out.printf("[���۷δ� ����] %d��: %d��\n", pepperoni_Count, pepperoni_Sales);
		}
		if (cheese_Count != 0) {
			System.out.printf("[ġ�� ����] %d��: %d��\n", cheese_Count, cheese_Sales);
		}
		if (bulgogi_Count != 0) {
			System.out.printf("[�Ұ�� ����] %d��: %d��\n", bulgogi_Count, bulgogi_Sales);
		}
		if (shrimp_Count != 0) {
			System.out.printf("[������ ����] %d��: %d��\n", shrimp_Count, shrimp_Sales);
		}

		System.out.println("==================");

		int cider_sales = Cider.PRICE * cider_Count;
		int coke_Sales = Coke.PRICE * coke_Count;
		int fanta_Sales = Fanta.PRICE * fanta_Count;
		int beer_Sales = Beer.PRICE * beer_Count;

		if (cider_Count != 0) {
			System.out.printf("[���̴�] %d��: %d��\n", cider_Count, cider_sales);
		}
		if (coke_Count != 0) {
			System.out.printf("[�ݶ�] %d��: %d��\n", coke_Count, coke_Sales);
		}
		if (fanta_Count != 0) {
			System.out.printf("[ȯŸ] %d��: %d��\n", fanta_Count, fanta_Sales);
		}
		if (beer_Count != 0) {
			System.out.printf("[����] %d��: %d��\n", beer_Count, beer_Sales);
		}

		System.out.printf("[�� �ݾ�] %d��\n", totalSales);
		return totalSales;
	}
}
