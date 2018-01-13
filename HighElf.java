class HighElf extends Elf{
    private int highElfHealth = getHealth()-50;
    private int highElfIntelligence = getIntelligence()+5;

    public HighElf(){
    }

    public int heal(Elf anotherElf){
        int notHighElfHealth = anotherElf.getHealth(); 
        notHighElfHealth += highElfIntelligence;
        anotherElf.setHealth(notHighElfHealth); 
        System.out.println(notHighElfHealth);
        return notHighElfHealth;
    }
    public int fireball(Elf anotherElf){
        int notHighElfHealth = anotherElf.getHealth();
        notHighElfHealth -= highElfIntelligence*3;
        anotherElf.setHealth(notHighElfHealth);
        System.out.println(notHighElfHealth);
        return notHighElfHealth;
    }
}