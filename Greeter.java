
//Greeter class = public, same as file name, blueprint
public class Greeter {
   
    /*this method is private because it has the logic
    createGreeting takes in a string toBeGreeted*/
    private String createGreeting(String toBeGreeted){
        //returns "Hello + the string parameter"
        return "Hello " + toBeGreeted;
    }
    /*greet method is public... but what the greet() method does
    is return createGreeting*/
    public String greet(){
        //greet is empty and can take in anything!
        return createGreeting("World");
        //this would return "Hello World"
    }
    //greet takes in two strings and returns createGreeting
    public String greet(String firstName, String lastName){
        return createGreeting(firstName + " " + lastName);
        /*so this should return - Hello firstName lastName*/
    }
    
}