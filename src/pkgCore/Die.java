package pkgCore;

public class Die {

	private int DieValue;

	public Die() {
		this.DieValue = (byte)(Math.random() * 6 + 1);
	}

	public int getDieValue() {
		return DieValue;
	}
}
