package termProject;

public class Beer implements Menu {
	public static final String NAME = "╦фаж";
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
