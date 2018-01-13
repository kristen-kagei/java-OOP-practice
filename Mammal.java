class Mammal{

/*
    private boolean sleeping = false;
    public void regulateTemperature() {
        System.out.println("My temperature is just right now.");
    }
    public void startSleeping() {
        sleeping = true;
        System.out.println("ZzZz");
    }
    public boolean isSleeping(){
        return sleeping;
    }
*/

    private int energyLevel;

    public int displayEnergy() {
        energyLevel = 100;
        System.out.println("Mammals start at energy level of: " + energyLevel);
        return energyLevel;
    }

}