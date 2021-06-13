package termProject;

public class Coke implements Menu {
	public static final String NAME = "ÄÝ¶ó";
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
