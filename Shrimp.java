package termProject;

public class Shrimp implements Menu {
	public static final String NAME = "쉬림프 피자";
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
