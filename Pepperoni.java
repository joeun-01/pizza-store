package termProject;

public class Pepperoni extends Menu {
	public static final String NAME = "Pepperoni pizza";
	public static final int PRICE = 3000;

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}
}