import java.nio.channels.ReadPendingException;
import java.text.DecimalFormat;
import java.util.Scanner;

abstract class shape {
    public abstract double getArea();
    public abstract double getPerimeter();

}

class RPentagon extends shape {
    private double e;
    RPentagon (double e) {
        this.e = e;
    }
    @Override
    public double getArea () {
        return 5*e*e/(4*Math.tan(36*Math.PI/180)); //计算正n边形的面积公式为： Area=n×a×a/(tan((180度/n))×4);
        //Math.tan() 的参数是弧度形式，角度弧度互换公式: 弧度 = 角度*(Math.PI/180)
    }
    @Override
    public double getPerimeter () {
        return 5 * this.e;
    }
}

public class RegularPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double e = input.nextDouble();
        RPentagon a = new RPentagon(e);
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(df.format(a.getArea()));
        System.out.println(df.format(a.getPerimeter()));
        input.close();
    }
}
