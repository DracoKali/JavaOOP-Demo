public class Dragon extends Animals{

    public void dragon(){
        setEnergyLevel( getEnergyLevel() + 200 );
    }

    public Dragon fly(){
        setEnergyLevel(getEnergyLevel() -50);
        System.out.println("Lost 50 energy");
        return this;

    }
    public Dragon eatHumans(){
        setEnergyLevel(getEnergyLevel() +25);
        System.out.println("Dragon gained 25 energy");
        return this;

    }
    public Dragon attackTown(){
        setEnergyLevel(getEnergyLevel() -100);
		System.out.println("Dragon lost 100 energy");
		return this;

    }
    public static void main(String[] args) {
        Dragon draco = new Dragon();
        draco.dragon();
        draco.attackTown().attackTown().attackTown().eatHumans().eatHumans().fly().fly();
        draco.displayEnergy();
    }

}