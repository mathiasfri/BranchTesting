public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }

    public void makeSound()
    {
        System.out.println("Vuff");
    }

    public boolean eat(String foodType){
        return true;
    }

    @Override
    public void showMood(boolean mood)
    {
        if (mood) {
            System.out.println("Hunden logrer");
        }
        else{
            System.out.println("Hunden knurrer");
        }
    }
}
