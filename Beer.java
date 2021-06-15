package termProject;

public class Beer extends Menu {
	public static final String NAME = "Beer";
	public static final int PRICE = 1000;

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}
}
