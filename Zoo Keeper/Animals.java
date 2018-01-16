public class Animals{
	private int energyLevel = 100;

	public int displayEnergy() {
		System.out.println("Energy Level: " + getEnergyLevel());
		return getEnergyLevel();
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public static void main(String[] args) {
		Gorilla g = new Gorilla();
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		g.climb();
		g.eatBananas();
		g.eatBananas();
		g.displayEnergy();
	}

}