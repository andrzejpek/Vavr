import io.vavr.Function1;
import io.vavr.Function2;


public class Cube {

    static Double precision = 0.1d;

    static Function1<Double,Double> cube = (a) -> (a*a*a);


    static Function2<Double, Double,Double> improve = (a, b) -> ((b/(a*a))+(a*2))/3;

    public static Double cubeRoot(Double x, Double y){
        if (Math.abs(cube.apply(x) - y) < precision){
            return x;
        }
        else{
            return cubeRoot(improve.apply(x,y) , y);
        }
    }
}
