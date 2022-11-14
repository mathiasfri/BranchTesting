public abstract class Animal
{
    String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public abstract void makeSound();

    public abstract boolean eat(String foodType);
}
