package termProject;

public class Cider extends Menu {
	public static final String NAME = "Cider";
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
