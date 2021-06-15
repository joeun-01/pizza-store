package termProject;

public class Materials {
	Material dough;
	Material cheeseA;
	Material cheeseB;
	Material tomatoSauce;
	Material pepperoni;
	Material bulgogi;
	Material shrimp;
	Material mushroom;
	Material onion;

	Materials() {
		this.dough = new Material("Dough", 800, 100);
		this.cheeseA = new Material("CheeseA", 800, 100);
		this.cheeseB = new Material("CheeseB", 800, 100);
		this.tomatoSauce = new Material("Tomato Sauce", 100, 100);
		this.pepperoni = new Material("Pepperoni", 50, 100);
		this.bulgogi = new Material("Bulgogi", 50, 100);
		this.shrimp = new Material("Shrimp", 60, 100);
		this.mushroom = new Material("Mushroom", 50, 100);
		this.onion = new Material("Onion", 500, 100);
	}

	private static Materials instance = new Materials();

	public static Materials getInstance() {
		if (instance == null) {
			instance = new Materials();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "Materials Summary:" + "\n dough = " + dough + "\n cheeseA = " + cheeseA + "\n cheeseB = " + cheeseB
				+ "\n tomatoSource = " + tomatoSauce + "\n pepperoni = " + pepperoni + "\n bulgogi = " + bulgogi
				+ "\n shrimp = " + shrimp + "\n mushroom = " + mushroom + "\n onion = " + onion;
	}

}
