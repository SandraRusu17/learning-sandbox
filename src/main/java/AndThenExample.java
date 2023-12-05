/**
 * Write a static method andThen that takes as parameters two Runnable instances
 * and returns a Runnable that runs the first, then the second. In the main method,
 * pass two lambda expressions into a call to andThen, and run the returned instance.
 */

public class AndThenExample {

    public static void main(String[] args) {
        // Defined two runnable instances  using lambda
        Runnable firstRunnable = () -> {
            System.out.println("This is the first message");
        };

        Runnable secondRunnable = () -> {
            System.out.println("This is the second message");
        };

        // Combined the two runnables
        Runnable combinedRunnable = andThen(firstRunnable, secondRunnable);

        // Run the combined runnable
        combinedRunnable.run();

    }

    public static Runnable andThen(Runnable firstInstance, Runnable secondInstance) {

        return () -> {
            firstInstance.run();
            secondInstance.run();
        };

    }
}
