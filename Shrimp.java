package termProject;

public class Shrimp implements Menu {
	public static final String NAME = "������ ����";
	public static final int PRICE = 4000;

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}
}
