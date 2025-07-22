import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Email {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 3 email sending tasks
        executor.submit(new EmailTask("user1@example.com"));
        executor.submit(new EmailTask("user2@example.com"));
        executor.submit(new EmailTask("user3@example.com"));

        // Shutdown the executor
        executor.shutdown();
    }
}

class EmailTask implements Runnable {
    private String email;

    public EmailTask(String email) {
        this.email = email;
    }

    @Override
    public void run() {
        System.out.println("Sending email to " + email + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate time taken to send email
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Email sent to " + email);
    }
}
