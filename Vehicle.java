//class Vehicle is the blueprint for a Vehicle object
class Vehicle {
    //variables themselves are private
    private int numberOfWheels;
    private String color;
    
    //constructor method(s).... 
    //by adding more and more ways of instatiating object, the constructor method is overloaded
    public Vehicle() {
    }
    public Vehicle(String color){
        this.color = color;
    }
    public Vehicle(String color, int num){
        this.color = color;
        this.numberOfWheels = num;
    }

    // getter method retrieving the information(field value)
    public int getNumberOfWheels() {
        return numberOfWheels;
        //we know to expect an integer becase we set it in the private varialbe
        //int reurn type
    }
    
    // setter method for setting the information(field value)
    //we know the method takes the a parameter (int number)
    public void setNumberOfWheels(int number) {
        //access the private variable we establish in the beginning, still available in the class
        numberOfWheels = number;
    }

    // getter method of retrieving color 
    public String getColor() {
        return color;
    }
    // setter method of setting color 
    public void setColor(String color) {
        //this is necessary to specify the instance variable 
        this.color = color;        // 1
    }
}