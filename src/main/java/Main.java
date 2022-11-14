public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Golden Retriever");
        Cat cat = new Cat("Sort kat");

        dog.makeSound();
        cat.makeSound();

        cat.eat("fish");
        dog.eat("bone");
    }
}
