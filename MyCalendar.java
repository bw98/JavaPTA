/*
用自带的 Calendar 类实现一个万年历
*/
import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar{
    public void calendar(int year, int month)
    {
        Calendar firstcal = Calendar.getInstance();
        Calendar lastcal = Calendar.getInstance();
        System.out.println("\t\t" + year + "年" + month + "月");
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        firstcal.set(year, month - 1, 1);// 所求月的第一天
        int dateofmonth = firstcal.getActualMaximum(Calendar.DATE);// 获取该月的天数
        lastcal.set(year, month - 1, dateofmonth);// 所求月的最后一天

        // 获取所求月第一天是星期几，输出是中文的而不是数字的
        // SimpleDateFormat fm = new SimpleDateFormat("E");
        // System.out.println(fm.format(firstcal.getTime()));

        int weekofmonth = firstcal.getActualMaximum(Calendar.WEEK_OF_MONTH);// 获取该月的星期数
        String[][] week = new String[weekofmonth][7];
        int firstday = MyCalendar.weekDay(firstcal); // 获取所求月第一天是星期几
        int lastday = MyCalendar.weekDay(lastcal); // 获取所求月最后一天是星期几
        int m = 1, f = 1;// f的作用主要是判断是否需要将第一个星期归到中间几个星期一起计算
        int j;
        // 第一个星期
        if (firstday == 7)
        {
            f = 0;
        }
        else{
            for (j = 0; j < firstday; j++)
            {
                week[0][j] = " ";
                System.out.print(week[0][j] + "\t");
            }
            for (j = firstday; j < 7; j++)
            {
                week[0][j] = m + "";
                m++;
                System.out.print(week[0][j] + "\t");
            }
            System.out.println();
        }
        // 中间的几个星期
        for (int i = f; i < weekofmonth - 1; i++)
        {
            for (j = 0; j < 7; j++)
            {
                week[i][j] = m + "";
                m++;
                System.out.print(week[i][j] + "\t");
            }
            System.out.println();
        }
        // 最后一个星期
        if (lastday == 7)
        {
            week[weekofmonth - 1][0] = m + "";
            System.out.print(week[weekofmonth - 1][0] + "\t");
        }
        else
        {
            for (j = 0; j <= lastday; j++)
            {
                week[weekofmonth - 1][j] = m + "";
                m++;
                System.out.print(week[weekofmonth - 1][j] + "\t");
            }
        }

    }

    public static int weekDay(Calendar cal)
    {
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        if (weekday == 1)// 西方星期日为第一天，星期一为第二天
            weekday = 7;
        else
            weekday -= 1;
        return weekday;
    }

    public static void main(String[] args)
    {
        MyCalendar mycal = new MyCalendar();
        Scanner input = new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<万年历>>>>>>>>>>>>>>");
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        mycal.calendar(year, month);

    }
}
