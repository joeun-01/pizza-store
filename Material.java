package termProject;

public class Material {
	String name; // ��� �̸�
	int price; // ����
	int receiving; // ��ü �԰� ����
	int shipping; // ��ü ��� ����
	int remaining; // ���� ����
	
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
			// �԰��ʿ�
			order = (num - this.remaining) * 2 + 100; // �������� 2�� �ֹ�
			this.receiving += order; // ��ü �԰� ����
			// System.out.println(this.name + " ��� ���� -> ��� �԰�: " + order);
		}
		this.shipping += num; // ��ü ��� ����
		this.remaining += order; // ���: �԰� ���� �ݿ�
		this.remaining -= num; // ���: ��� ���� �ݿ�

		//System.out.println(this.name + " ��� ���: " + num + " ���: " + this.remaining);
		//System.out.println(this.name + " ��ü �԰�: " + this.receiving + " ��ü ���: " +
		// this.shipping + " ���: " + this.remaining);
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
		return "[��� = " + name + ", ���� = " + price +  ", ��� = " + remaining + "]\n";
	}

}
