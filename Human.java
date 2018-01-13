class Human extends Mammal {
    //Human is a subclass of Mammal. 
    //Mammal  is the superclass of Human
    //"extends" tells the compiler what the relationship is
    //Human class inherits all members from superclass
    //It will not have access to private member variables 

    public void goToWork(){
        System.out.println("I'm going to work, something only humans can do.");
    }
    //If you don't want every method to be the same, you can override the method

    //this will print toss and turn instead of zzz
    public void startSleeping(){
        System.out.println("Toss and Turn");
        super.startSleeping(); //brings it back to sleeping from superclass
    }
}

