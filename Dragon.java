class Dragon extends Mammal{

    private int energyLevel=displayEnergy();

    public int displayEnergy(){
        energyLevel = 300; 
        System.out.println("Dragons have a higher default energy level. I learned that playing D&D. Thanks, Coding Dojo! Dragons start with this much energy: " + energyLevel);
        return energyLevel;
    }

    public int eatHumans(){
        energyLevel += 25;
        System.out.println("Dragons eat people, too. This gives them " + energyLevel);
        return this.energyLevel;
    }

    public int fly(){
        energyLevel -= 50;
        System.out.println("Dragons fly, I learned that in Game of Thrones. Now they have this much energy: " + energyLevel);
        return this.energyLevel;
    }

    public int attackTown(){
        energyLevel -= 100;
        System.out.println("Dragons attack towns becaue of their heightened consciousness. Now they have this much energy: " + energyLevel);
        return this.energyLevel;
    }

}