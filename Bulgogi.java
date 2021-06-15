package termProject;

public class Bulgogi extends Menu {
	public static final String NAME = "Bulgogi pizza";
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
