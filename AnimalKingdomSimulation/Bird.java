public class Bird extends Animal {
// Here Bird is inheriting from Animal

    public Bird(String name, int age){
        super(name, age);
    }
    
    // Here we override makeSound() to make a sound specific to the Bird,
    // in this case, "chirp!".
    @Override
    public String makeSound(){
        //System.out.println("Chirp chirp!");
        return "Chirp chirp!";
    }

    // Here is a specific method only found in Bird, named fly()/
    public String fly(){
        return "I can fly...";
    }
}

  

