package termProject;

public class Shrimp extends Menu {
	public static final String NAME = "Shrimp pizza";
	public static final int PRICE = 4000;

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}
}
