package termProject;

public class Cider implements Menu {
	public static final String NAME = "���̴�";
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
