
import io.vavr.collection.Stream;

public class Euler {


     static long euler(int max) {
        final long smallestStepsNeeded = max * (max - 1);
        return Stream.iterate(smallestStepsNeeded, prev -> prev + smallestStepsNeeded)
                .filter(val -> isDivisible(max, val))
                .get();
    }

    private static boolean isDivisible(int max, long val) {
        return !Stream.rangeClosed(1, max).exists(d -> val % d != 0);
    }




}
