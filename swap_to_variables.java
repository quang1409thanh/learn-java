import java.util.Collection;
import java.util.Collections;
public class  swap_to_variables {
    public static void main(String[] args ) {
        String x="Water";
        String y="Coca-Cola";
        String temp=x;
        x=y;
        y=temp;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
