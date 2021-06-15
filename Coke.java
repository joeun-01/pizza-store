package termProject;

public class Coke extends Menu {
	public static final String NAME = "Coke";
	public static final int PRICE = 800;

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}
}
