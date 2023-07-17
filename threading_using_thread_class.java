class thread_class extends Thread {
    String to_print;
    public thread_class(String to_print) {
        this.to_print = to_print;
    }

    public void run() {
        for(int i=0;i<3;i++) {
            System.out.println(to_print);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class threading_using_thread_class {
    public static void main(String[] args) {
        thread_class a = new thread_class("vikas");
        thread_class b = new thread_class("yadav");

        // a.run();
        // b.run();
        a.start();
        b.start();

    }
}