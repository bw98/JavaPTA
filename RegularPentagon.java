/*
7-6 计算正五边形的面积和周长（10 分）
从下列的抽象类shape类扩展出一个正五边形（regular pentagon）类RPentagon,
这个类将正五边形的边长作为私有成员，类中包含初始化这个值的构造方法。 

public abstract class shape {// 抽象类 
    / 抽象方法 求面积 /
    public abstract double getArea(); 
    / 抽象方法 求周长 / 
    public abstract double getPerimeter(); 
} 

请编程从键盘输入正五边形的边长值，创建一个正五边形对象，然后输出正五边形的面积和正五边形的周长。计
算正五边形的面积公式为： S=5a^2/(4tan(36度))其中a为边长。 或者：S=(1/4)a^2√(25+10√5) 输出结果保留4位小数。


输入格式:
输入正五边形的边长。例如： 5

输出格式:
输出正五边形的面积和周长。第一行输出面积，第二行输出周长。例如： 43.0119 25

输入样例:
16.8
输出样例:
485.5875
84
*/
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
