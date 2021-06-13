package termProject;

public class Pepperoni implements Menu {
	public static final String NAME = "페페로니 피자";
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