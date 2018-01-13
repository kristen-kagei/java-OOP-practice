/*
Samurai: Set a default health of 200

Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half

Samurai: Add a method meditate() that heals the Samurai for half of their current health.

Samurai: Add a method howMany() that returns the total current number of Samurai.
*/

class WoodElf extends Elf{
    private int woodElfHealth = 200;
    private static int countWoodElf=0;

    public WoodElf(){
        countWoodElf++;
    };

    // public int displayHealth(){
    // }
    public int deathBlow(Elf anotherElf){
        anotherElf.setHealth(0);
        int dead = anotherElf.getHealth();
        woodElfHealth /= 2;
        System.out.println(woodElfHealth);
        System.out.println("Holy crap. The Eladrin just killed another Elf with a death blow");        
        return dead;
    }
    public int meditate(){
        woodElfHealth += (woodElfHealth/2);
        System.out.println(woodElfHealth);
        return woodElfHealth;
    }
    public static int howMany(){
        System.out.println(countWoodElf);
        return countWoodElf;
    }
}