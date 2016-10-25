package QA.Other;

/**
 * Created by lxrm on 2016/10/25.
 */
public class GenericTest
{
    public static void main(String [] args)
    {
        Person<Worker> p = new Person<>();
        Worker w = new Worker();
        p.show(w);
    }
}

interface IWorker
{
    void show();
}

class  Person<T extends IWorker>
{
    public void show(T t)
    {
        t.show();
    }
}

class Worker implements IWorker
{
    public void show()
    {
        System.out.println("Hi~ worker");
    }
}

