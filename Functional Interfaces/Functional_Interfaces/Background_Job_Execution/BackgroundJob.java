package Functional_Interfaces.Background_Job_Execution;

public class BackgroundJob {
    public static void main(String[] args) {
        
        Runnable task = () -> {
            System.out.println("Background task started...");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background task finished.");
        };
        
        Thread thread = new Thread(task);
        thread.start();
        
        System.out.println("Main thread continues...");
    }
}
