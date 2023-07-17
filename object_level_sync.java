class first implements Runnable {
    public void run() {
        System.out.println("The entry thread name is: " + Thread.currentThread().getName());
        synchronized(this) {
            System.out.println("The exit thread name is: " + Thread.currentThread().getName());
        }
    }
}

public class object_level_sync {
    public static void main(String[] args) {
        Thread t1 = new Thread(new first(), "first Thread");
        Thread t2 = new Thread(new first(), "second Thread");
        Thread t3 = new Thread(new first(), "third Thread");
        t1.start();
        t2.start();
        t3.start();
    }

}
