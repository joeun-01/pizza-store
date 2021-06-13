package termProject;

import java.util.ArrayList;
import java.util.Random;

public class Order {
	public ArrayList<String> orders;

	public static int totalSales = 0;
	public static int pepperoni_Count = 0;
	public static int cheese_Count = 0;
	public static int bulgogi_Count = 0;
	public static int shrimp_Count = 0;
	public static int cider_Count = 0;
	public static int coke_Count = 0;
	public static int fanta_Count = 0;
	public static int beer_Count = 0;

	public Order(ArrayList<String> payList) {
		orders = new ArrayList<String>();
		orders = (ArrayList<String>) payList.clone();
	}

	public ArrayList<String> orderMenu() {

		// count sold pizza
		for (String pizza : orders) {
			switch (pizza) {
			case "페퍼로니 피자":
				Menu pepperoni = new Pepperoni();
				pepperoni_Count++;
				totalSales += pepperoni.getPrice();
				break;
			case "치즈 피자":
				Menu cheese = new Cheese();
				cheese_Count++;
				totalSales += cheese.getPrice();
				break;
			case "불고기 피자":
				Menu bulgogi = new Bulgogi();
				bulgogi_Count++;
				totalSales += bulgogi.getPrice();
				break;
			case "쉬림프 피자":
				Menu shrimp = new Shrimp();
				shrimp_Count++;
				totalSales += shrimp.getPrice();
				break;
			}
		}

		// count sold drink
		for (String drink : orders) {
			switch (drink) {
			case "사이다":
				Menu cider = new Cider();
				cider_Count++;
				totalSales += cider.getPrice();
				break;
			case "콜라":
				Menu coke = new Coke();
				coke_Count++;
				totalSales += coke.getPrice();
				break;
			case "환타":
				Menu fanta = new Fanta();
				fanta_Count++;
				totalSales += fanta.getPrice();
				break;
			case "맥주":
				Menu beer = new Beer();
				beer_Count++;
				totalSales += beer.getPrice();
				break;
			}
		}

		return orders;
	}
}
