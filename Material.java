package termProject;

public class Material {
	String name; // 재료 이름
	int price; // 가격
	int receiving; // 전체 입고 개수
	int shipping; // 전체 출고 개수
	int remaining; // 남은 개수
	
	public Material() {
		
	}

	public Material(String name, int price, int receiving) {
		this.name = name;
		this.price = price;
		this.receiving = receiving;
		this.shipping = 0;
		this.remaining = receiving;
	}

	public void Use(int num) {
		int order = 0;

		if (this.remaining >= num) {
		} else {
			// 입고필요
			order = (num - this.remaining) * 2 + 100; // 부족분의 2배 주문
			this.receiving += order; // 전체 입고 개수
			// System.out.println(this.name + " 재료 부족 -> 재료 입고: " + order);
		}
		this.shipping += num; // 전체 출고 개수
		this.remaining += order; // 재고: 입고 개수 반영
		this.remaining -= num; // 재고: 출고 개수 반영

		//System.out.println(this.name + " 재료 사용: " + num + " 재고: " + this.remaining);
		//System.out.println(this.name + " 전체 입고: " + this.receiving + " 전체 출고: " +
		// this.shipping + " 재고: " + this.remaining);
	}

	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}

	public int getReceiving() {
		return this.receiving;
	}

	public int getShipping() {
		return this.shipping;
	}

	public int getRemaining() {
		return this.remaining;
	}

	@Override
	public String toString() {
		return "[재료 = " + name + ", 가격 = " + price +  ", 재고 = " + remaining + "]\n";
	}

}
