namespace cours29_01;

public class BooleanOperatorsClass
{
    private readonly bool a = true;
    private readonly bool b = true;

    public void LogBoolOperators()
    {
        Console.WriteLine(a && b);
        Console.WriteLine(a || b);
        Console.WriteLine(a ^ b);
    }

    public void LogDeMorgan()
    {
        // Loi de De Morgan
        var c = !(a || b);
        var d = !a && !b;
        Console.WriteLine(c == d);
        var e = !(a && b);
        var f = !a || !b;
        Console.WriteLine(e == f);
    }

    public static string CalculatePerimeter(double length, double width)
    {
        return "L'aire du rectangle est de: " + length * width;
    }

    public static string CalculateCircumference(double radius)
    {
        return "Le diamètre du : " + 2 * Math.PI * radius;
    }

    public static string CalculateArea(double radius)
    {
        return "Le diamètre du : " + Math.PI * Math.Pow(radius, 2);
    }
}