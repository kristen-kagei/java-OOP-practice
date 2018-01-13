class Elf {
    //by making these private, if i want to access them later you have to make the getter/setter 
  private int strength = 3; 
  private int stealth = 3; 
  private int intelligence = 3;
  private int health = 100;
  
    //Constructors to create instances 
  public Elf(){}

    //get/set intelligence
  public int getIntelligence() {
		return intelligence;
  } 
  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }
    //get/set stealth
  public int getStealth() {
		return stealth;
  }
  public void setStealth(int stealth) {
    this.stealth = stealth;
  }
    //get/set strength
  public int getStrength() {
		return strength;
  }
  public void setStrength(int strength) {
    this.strength = strength;
  }
    //get/set health
  public int getHealth() {
    // System.out.println(health);
		return health;
  }
  public void setHealth(int health) {
    this.health = health;
  }

     //if I want to access any of the variables in another class I will need setter/getter
  public int attack(Elf anotherElf) {
    int anotherElfHealth = anotherElf.getHealth()- this.getStrength();
    anotherElf.setHealth(anotherElfHealth);
    System.out.println(anotherElfHealth);
    return anotherElfHealth;
  }

}