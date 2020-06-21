
import io.vavr.Function2;


public class Heron {


    public static boolean steps(int step){
        return step==0;
    }

    static Function2<Double, Double,Double> avg = (a, b) -> (a + b)/2;
    static Function2<Double, Double,Double> improve = (a, b) -> avg.apply(a,(b/a));




    public static Double squareRoot(Double x, Double y, Integer steps){
        if (steps(steps)){
            return x;
        }
        else{
            return squareRoot( improve.apply(x,y) , y , steps-1);
        }
    }







}
