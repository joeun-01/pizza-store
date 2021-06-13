package termProject;

public class Cheese implements Menu {
	public static final String NAME = "치즈 피자";
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