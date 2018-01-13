class Gorilla extends Mammal{

    private int gorillaEnergy = displayEnergy();
    
    public int throwSomething(){
        gorillaEnergy +=- 5; 
        System.out.println("Mr. Gorilla has thrown something. Now his energy level is "+ gorillaEnergy);
        return this.gorillaEnergy;    
    }
    public int eatBananas(){
        gorillaEnergy += 10;        
        System.out.println("Mr. Gorilla is satisfied with his bounty. Now his energy level is " + gorillaEnergy);
        return this.gorillaEnergy;            
    }
    public int climb(){
        gorillaEnergy -= 10;        
        System.out.println("Mr. Gorilla has climbed a tree and will retire from all other activity today. Now his energy level is " + gorillaEnergy);
        return this.gorillaEnergy;
    }
}