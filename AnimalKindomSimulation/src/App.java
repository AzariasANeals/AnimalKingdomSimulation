
import java.util.ArrayList;

// In order to run this program just click "Run Java" and the code will run.
// It will display information about specific animals and certain behaviors that only
// specific animals possess. 
public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Rover", 3);
        Cat cat = new Cat("Fido", 2);
        Bird bird = new Bird("Peppy", 5);

        // Here we have created a ArrayList to store all of our animals.
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        // Here is a for-each loop, that will loop through our ArrayList and
        // print all the animals found within it. We also have specific "if/else if" statements
        // that will only activate for specific subclasses. For example the chase() method
        // will only print for Dog, because only Dog contains a chase() method.
        for (Animal a: animals){
            a.displayInfo();
            a.eat();
            a.sleep();
            a.makeSound();

            if(a instanceof Dog){
                ((Dog)a).chase();
            }
            else if(a instanceof Cat){
                ((Cat)a).jump();
            }
            else if(a instanceof Bird){
                ((Bird)a).fly();
            }
            System.out.println("");
        }
    }
}
