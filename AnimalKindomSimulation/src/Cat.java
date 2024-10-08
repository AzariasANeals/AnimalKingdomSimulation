public class Cat extends Animal {
// Here Cat is inheriting from Animal

    public Cat(String name, int age){
        super(name, age);
    }
    // Here we are overriding makeSound() to make a sound specific for the Cat,
    // in this case "Meow"
    @Override
    public void makeSound(){
        System.out.println("Meow meow!");
    }

    // Here is a special method named jump() that is only present in the Cat class.
    public void jump(){
        System.out.println("I can jump really high...");
    }
}
