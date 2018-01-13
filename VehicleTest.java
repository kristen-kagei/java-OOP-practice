//to match file
class VehicleTest {
    public static void main(String[] args) {
        // instance of class object, named bike 
        Vehicle bike = new Vehicle();
        // instance of class object, named car
        Vehicle car = new Vehicle();
        //setting the number of wheels for bike (doesn't need this because all bikes have two wheels)
        
        //Constructor Method...
        //this time we pass in "red"
        Vehicle redVehicle = new Vehicle("red");
        String color = redVehicle.getColor();
        System.out.println("The Vehicle color is: " + color);

        
        bike.setNumberOfWheels(2);
        //setting the color (of this instance)
        bike.setColor("red");
        //accessing (getting) the number of bike wheels in a variable we set
        int bikeWheels = bike.getNumberOfWheels();
        //accessing the color of this particular instance of bike
        String bikeColor = bike.getColor();
        //setting car wheels
        car.setNumberOfWheels(4);
        //setting color of car for this instance of creation
        car.setColor("green");
        //accessing(getting the number of wheels)
        int carWheels = car.getNumberOfWheels();
        //accessing(getting the color)
        String carColor = car.getColor();
        //printing the information we've input and set
        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
    }
}
/*"While it may seem repetitive to write getters and 
setters for every field, it is part of writing good, extensible, 
Java code that we explicitly declare access privileges for 
any member variable that we want to expose to the outside world." */
