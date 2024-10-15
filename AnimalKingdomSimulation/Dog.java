public class Dog extends Animal {
// Here Dog is inheriting from Animal


    public Dog(String name, int age){
        super(name, age);
    }
    // Here we override the makeSound() method to make a specific sound 
    // for the dog (In this case: "woof").
    @Override
    public String makeSound(){
        //System.out.println("Woof woof!");
        return "Woof woof!";
    }

    // Here we override the eat() method to further specify what the dog eats.
    // In this case, it eats kibbles and bits.
    @Override
    public void eat(){
        super.eat();
        System.out.println("I like kibbles and bits...");
    }

    // Here is a special method specific to the Dog class named chase().
    public String chase(){
        return "I like chasing cars...";
    }
}
