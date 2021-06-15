package termProject;

public class Cheese extends Menu {
	public static final String NAME = "Cheese pizza";
	public static final int PRICE = 2000;

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}
}