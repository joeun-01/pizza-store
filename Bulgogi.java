package termProject;

public class Bulgogi implements Menu {
	public static final String NAME = "불고기 피자";
	public static final int PRICE = 5000;

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}
}
