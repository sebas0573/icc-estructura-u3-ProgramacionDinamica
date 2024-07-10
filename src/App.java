
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programación Dinámica");

        long startime, endtime = 0;
        startime = System.nanoTime();
        System.out.println(fibonacci(40));
        endtime = System.nanoTime();
        System.out.println("Time taken: " + (endtime - startime) + " ns");

        startime = System.nanoTime();
        System.out.println(fibonacciWithCaching(40));
        endtime = System.nanoTime();
        System.out.println("Time taken: " + (endtime - startime) + " ns");

        startime = System.nanoTime();
        System.out.println(fibonacciCaching(40));
        endtime = System.nanoTime();
        System.out.println("Time taken: " + (endtime - startime) + " ns");

        /// Ejericio 1
        // runEjercicio();

    }

    // Normal recursive method
    public static int fibonacci(int n) {
        // TODO: Implement this method
        return 0;
    }

    // First caching method: Using a Map
    public static int fibonacciWithCaching(int n) {
        // TODO: Implement this method
        return 0;
    }

    // Second caching method: Using an array
    public static int fibonacciCaching(int n) {
        // TODO: Implement this method
        return 0;
    }

    public static void runEjercicio() {

        // boolean[][] grid = {
        // { true, true, true, true },
        // { false, false, false, true },
        // { true, true, false, true },
        // { true, true, false, true }
        // };

    }
}
