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
			case "Pepperoni pizza":
				Menu_interface pepperoni = new Pepperoni();
				pepperoni_Count++;
				totalSales += pepperoni.getPrice();
				UseMaterial pepperoniPizza = new UseMaterial("Pepperoni pizza");
				pepperoniPizza.useTopping();
				break;
			case "Cheese pizza":
				Menu_interface cheese = new Cheese();
				cheese_Count++;
				totalSales += cheese.getPrice();
				UseMaterial cheesePizza = new UseMaterial("Cheese pizza");
				cheesePizza.useTopping();
				break;
			case "Bulgogi pizza":
				Menu_interface bulgogi = new Bulgogi();
				bulgogi_Count++;
				totalSales += bulgogi.getPrice();
				UseMaterial bulgogiPizza = new UseMaterial("Bulgogi pizza");
				bulgogiPizza.useTopping();
				break;
			case "Shrimp pizza":
				Menu_interface shrimp = new Shrimp();
				shrimp_Count++;
				totalSales += shrimp.getPrice();
				UseMaterial shrimpPizza = new UseMaterial("Shrimp pizza");
				shrimpPizza.useTopping();
				break;
			}
		}

		// count sold drink
		for (String drink : orders) {
			switch (drink) {
			case "Cider":
				Menu_interface cider = new Cider();
				cider_Count++;
				totalSales += cider.getPrice();
				break;
			case "Coke":
				Menu_interface coke = new Coke();
				coke_Count++;
				totalSales += coke.getPrice();
				break;
			case "Fanta":
				Menu_interface fanta = new Fanta();
				fanta_Count++;
				totalSales += fanta.getPrice();
				break;
			case "Beer":
				Menu_interface beer = new Beer();
				beer_Count++;
				totalSales += beer.getPrice();
				break;
			}
		}

		return orders;
	}
}
