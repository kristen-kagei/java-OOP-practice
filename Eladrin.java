
class Eladrin extends Elf{
    private int eladrinStealth = getStealth()+7;

    public Eladrin(){}

    public int steal(Elf anotherElf){
        int stolenStealth = anotherElf.getHealth() - eladrinStealth;
        int newHealth = this.getHealth() + stolenStealth;
        this.setStealth(newHealth);
        System.out.println(newHealth);
        return newHealth;
    }
}