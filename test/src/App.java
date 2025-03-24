import java.util.Random;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(randInt(0, 100));
        }
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(min, max);
    }
}