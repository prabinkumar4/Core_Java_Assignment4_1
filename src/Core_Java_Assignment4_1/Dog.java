package Core_Java_Assignment4_1;

/**
 * The Dog class will have all the features of the animal class. But cat class can have it's own features
 
 */
	
public class Dog extends Animal {																			
	 public Dog() {																							
        System.out.println("I am a general dog"+															
                           "\nNon-Argument Method Called\n");}
     public Dog(String breed) {																				
        System.out.println("I am a dog of this kind: " + breed+""+"\nSingle Argument Method Called\n"+		
        				   "In above two Case Dog() Method overloading take place. "
        				   + "Firstly with Non- Argument Method then with Single Argument Method.\n");}
    @Override
    public void eat() {																						
        System.out.println("Dog eats default food"+															
        				   "\neat() Method is originally created in Animal class. "
        				   + "Now, eat() Method is overriding in Dog Class which extends Animal Class\n");}
    public void eat(String food) {																			
        System.out.println("Dog eats this food: " + food+""+												
        					"\nNow, I have Overloading the overriding Method" );}
}

