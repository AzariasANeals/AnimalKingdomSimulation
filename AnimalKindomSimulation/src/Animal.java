public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println(name + " eats...");
    }

    public void sleep(){
        System.out.println(name + " sleeps...");
    }

    public void displayInfo(){
        System.out.println("--ANIMAL INFO--");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("");
    }

}
