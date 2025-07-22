import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.submit(new A());
    }
}

class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}