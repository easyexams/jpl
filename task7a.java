class FT implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("First Thread is interrupted when sleeping");
            }
        }
    }
}

class ST implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Hello");
                Thread.sleep(2000);
            }

            catch (InterruptedException e) {
                System.out.println("Second Thread is interrupted when sleeping");
            }
        }
    }
}

class TT implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Welcome");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Third Thread is interrupted when sleeping");
            }
        }
    }
}

public class task7a {
    public static void main(String[] args) {
        FT ft = new FT();
        ST st = new ST();
        TT tt = new TT();
        Thread thread1 = new Thread(ft);
        thread1.start();
        Thread thread2 = new Thread(st);
        thread2.start();
        Thread thread3 = new Thread(tt);
        thread3.start();
    }
}
