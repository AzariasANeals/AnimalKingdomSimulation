public class Bird extends Animal {
// Here Bird is inheriting from Animal

    public Bird(String name, int age){
        super(name, age);
    }
    
    // Here we override makeSound() to make a sound specific to the Bird,
    // in this case, "chirp!".
    @Override
    public void makeSound(){
        System.out.println("Chirp chirp!");
    }

    // Here is a specific method only found in Bird, named fly()/
    public void fly(){
        System.out.println("I can fly...");
    }
}

  

