import java.util.Random;

public class Exp11 {
    public static void main(String[] args) {
        NumberContainer numberContainer = new NumberContainer();
        RandomNumberGenerator generator = new RandomNumberGenerator(numberContainer);
        Thread thread1 = new Thread(generator);

        SquareCalculator squareCalculator = new SquareCalculator(numberContainer);
        Thread thread2 = new Thread(squareCalculator);

        CubeCalculator cubeCalculator = new CubeCalculator(numberContainer);
        Thread thread3 = new Thread(cubeCalculator);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class NumberContainer {
    private int number;
    private boolean isNumberGenerated = false;

    public synchronized void setNumber(int number) {
        this.number = number;
        isNumberGenerated = true;
        notifyAll();
    }

    public synchronized int getNumber() throws InterruptedException {
        while (!isNumberGenerated) {
            wait();
        }
        isNumberGenerated = false;
        return number;
    }
}

class RandomNumberGenerator implements Runnable {
    private final NumberContainer numberContainer;

    public RandomNumberGenerator(NumberContainer numberContainer) { 
        this.numberContainer = numberContainer;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(100);
            System.out.println("Generated: " + randomNumber);
            numberContainer.setNumber(randomNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class SquareCalculator implements Runnable {
    private final NumberContainer numberContainer;

    public SquareCalculator(NumberContainer numberContainer) {
        this.numberContainer = numberContainer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int number = numberContainer.getNumber();
                int square = number * number;
                System.out.println("Square: " + square);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class CubeCalculator implements Runnable {
    private final NumberContainer numberContainer;

    public CubeCalculator(NumberContainer numberContainer) {
        this.numberContainer = numberContainer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int number = numberContainer.getNumber();
                int cube = number * number * number;
                System.out.println("Cube: " + cube);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
