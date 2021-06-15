package termProject;

public class PrintStock extends UseMaterial {

	public PrintStock(String name) {
		super(name);

	}

	public String printMaterials() {
		Materials materials = Materials.getInstance();

		return "<html>" + materials.dough.toString() + "<br>" + materials.cheeseA.toString() + "<br>" + materials.pepperoni.toString()
				+ "<br>" + materials.tomatoSauce.toString() + "<br>" + materials.mushroom.toString() + "<br>"
				+ materials.onion.toString() + "<html>";
	}

}
