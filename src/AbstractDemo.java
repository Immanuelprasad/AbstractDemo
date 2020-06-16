abstract class Human                 //1. 1st Example
{
    public abstract void eat();

    public void walk()
    {

    }
}
class Man extends Human
{
    public void eat()
    {
        System.out.println("Eat");
    }
}
class Printer                              //2. 2nd Example
{
    public void show(Number i)
    {
        System.out.println(i);
    }
}

public class AbstractDemo
{
    public static void main(String[] args)
    {
        Printer obj = new Printer();
        obj.show(8.7);

        Human obj1 = new Man();
        obj1.eat();

    }
}

