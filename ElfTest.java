class ElfTest {
    public static void main(String args[]) {
        Elf elf1 = new Elf();
        Elf elf2 = new Elf();
        HighElf highElf1 = new HighElf();
        Eladrin eladrin1 = new Eladrin();
        WoodElf woodElf1 = new WoodElf();
        WoodElf woodElf2 = new WoodElf();
        WoodElf woodElf3 = new WoodElf();
        
        

        elf1.attack(elf2);
        highElf1.heal(elf2);
        highElf1.fireball(elf2);
        eladrin1.steal(elf2);
        woodElf1.deathBlow(elf2);
        woodElf1.meditate();
        WoodElf.howMany();
    }
}