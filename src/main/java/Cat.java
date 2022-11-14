public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    public void makeSound()
    {
        System.out.println("Meow");
    }

    public boolean eat(String foodType){
        return true;
    }

    @Override
    public void showMood(boolean mood)
    {
        if (mood) {
            System.out.println("Katten spinder");
        }
        else{
            System.out.println("Katten hvæser");
        }
    }
}
