public class Gorilla extends Animals{
    public Gorilla throwSomething() {
        setEnergyLevel(getEnergyLevel() -5);
        System.out.println("Gorilla threw poop at caretaker and lost energy from being chased by");
        return this;
    }
    public Gorilla eatBananas() {
            setEnergyLevel(getEnergyLevel() +10);
            System.out.println("Gained health by eating bannna");
            return this;
    }
    public Gorilla climb() {
            setEnergyLevel(getEnergyLevel() -10);
            System.out.println("Gorilla climbed a tree to look at guests and lost energy");
            return this;
    }
}





