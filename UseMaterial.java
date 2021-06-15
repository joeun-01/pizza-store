package termProject;

import java.util.ArrayList;

public class UseMaterial {
	String name; // 피자 이름

//	Materials materials;
//	int order; // 주문
	public UseMaterial(String name) {
		this.name = name;
	}

	public void useTopping() {

		Materials materials = Materials.getInstance();

		if (this.name == "Pepperoni pizza") {
			materials.dough.Use(1);
			materials.cheeseA.Use(1);
			materials.pepperoni.Use(6);
			materials.tomatoSauce.Use(1);
			materials.mushroom.Use(6);
			materials.onion.Use(6);
		} else if (this.name == "Bulgogi pizza") {
			materials.dough.Use(1);
			materials.cheeseB.Use(1);
			materials.bulgogi.Use(6);
			materials.tomatoSauce.Use(1);
			materials.mushroom.Use(6);
			materials.onion.Use(6);
		} else if (this.name == "Cheese pizza") {
			materials.dough.Use(1);
			materials.cheeseA.Use(1);
			materials.cheeseB.Use(1);
			materials.tomatoSauce.Use(1);
		} else if (this.name == "Shrimp pizza") {
			materials.dough.Use(1);
			materials.cheeseA.Use(1);
			materials.shrimp.Use(6);
			materials.tomatoSauce.Use(1);
			materials.mushroom.Use(6);
			materials.onion.Use(6);
		}
	}

	public String getName() {
		return this.name;
	}
}
