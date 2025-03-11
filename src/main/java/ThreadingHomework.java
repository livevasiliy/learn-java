class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException interruptedException) {
                System.out.println("Number thread was interrupted.");
            }
        }
    }
}

class LetterThread extends Thread {
    @Override
    public void run() {
        for (char i = 'A'; i <= 'J'; i++) {
            System.out.println("Letter: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException interruptedException) {
                System.out.println("Letter thread was interrupted.");
            }
        }
    }
}

public class ThreadingHomework {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        LetterThread letterThread = new LetterThread();
        numberThread.start();
        letterThread.start();
    }
}
