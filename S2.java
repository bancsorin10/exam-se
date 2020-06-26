
public class S2 {
    public static void main(String[] args) {
        RThread RThread1 = new RThread("RThread1");
        RThread RThread2 = new RThread("RThread2");

        RThread1.start();
        RThread2.start();
    }
}

class RThread extends Thread {
    private String name;

    RThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            System.out.println(name + " - " + i);
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("failed to sleep");
            }
        }
    }
}
