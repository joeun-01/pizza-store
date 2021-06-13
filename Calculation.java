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
			System.out.printf("[페퍼로니 피자] %d개: %d원\n", pepperoni_Count, pepperoni_Sales);
		}
		if (cheese_Count != 0) {
			System.out.printf("[치즈 피자] %d개: %d원\n", cheese_Count, cheese_Sales);
		}
		if (bulgogi_Count != 0) {
			System.out.printf("[불고기 피자] %d개: %d원\n", bulgogi_Count, bulgogi_Sales);
		}
		if (shrimp_Count != 0) {
			System.out.printf("[쉬림프 피자] %d개: %d원\n", shrimp_Count, shrimp_Sales);
		}

		System.out.println("==================");

		int cider_sales = Cider.PRICE * cider_Count;
		int coke_Sales = Coke.PRICE * coke_Count;
		int fanta_Sales = Fanta.PRICE * fanta_Count;
		int beer_Sales = Beer.PRICE * beer_Count;

		if (cider_Count != 0) {
			System.out.printf("[사이다] %d개: %d원\n", cider_Count, cider_sales);
		}
		if (coke_Count != 0) {
			System.out.printf("[콜라] %d개: %d원\n", coke_Count, coke_Sales);
		}
		if (fanta_Count != 0) {
			System.out.printf("[환타] %d개: %d원\n", fanta_Count, fanta_Sales);
		}
		if (beer_Count != 0) {
			System.out.printf("[맥주] %d개: %d원\n", beer_Count, beer_Sales);
		}

		System.out.printf("[총 금액] %d원\n", totalSales);
		return totalSales;
	}
}
