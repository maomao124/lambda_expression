/**
 * Project name(项目名称)：Lambda表达式
 * Package(包名): PACKAGE_NAME
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/18
 * Time(创建时间)： 13:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    /**
     * 通过操作符，进行计算
     *
     * @param opr 操作符
     * @return 实现Calculable接口对象
     */
    public static Calculable calculate(char opr)
    {
        Calculable result;
        if (opr == '+')
        {
            // 匿名内部类实现Calculable接口
            result = new Calculable()
            {
                // 实现加法运算
                @Override
                public int calculateInt(int a, int b)
                {
                    return a + b;
                }
            };
        }
        else
        {
            // 匿名内部类实现Calculable接口
            result = new Calculable()
            {
                // 实现减法运算
                @Override
                public int calculateInt(int a, int b)
                {
                    return a - b;
                }
            };
        }
        return result;
    }

    public static void main(String[] args)
    {
        int n1 = 10;
        int n2 = 5;
        // 实现加法计算Calculable对象
        Calculable f1 = calculate('+');
        // 实现减法计算Calculable对象
        Calculable f2 = calculate('-');
        // 调用calculateInt方法进行加法计算
        System.out.println(n1 + "+" + n2 + "=" + f1.calculateInt(n1, n2));
        // System.out.printf("%d + %d = %d \n", n1, n2, f1.calculateInt(n1, n2));
        // 调用calculateInt方法进行减法计算
        System.out.println(n1 + "-" + n2 + "=" + f2.calculateInt(n1, n2));
        // System.out.printf("%d - %d = %d \n", n1, n2, f2.calculateInt(n1, n2));
    }
}
