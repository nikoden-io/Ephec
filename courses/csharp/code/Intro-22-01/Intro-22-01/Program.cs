Console.WriteLine("Hello, World!");
Console.WriteLine(
    "==============================================\n\tNicolas Denoël\n\t29 Avenue de la Liberté\n\t1400 Nivelles\n==============================================");
Console.WriteLine(Math.Pow(3, 2));
var a = 2;
var b = 0;

try
{
    Console.WriteLine(a / b);
}
catch (Exception e)
{
    Console.WriteLine("ERROR");
}

int c = 7;
int d = 3;

try
{
    var result = c / (float)d;
    Console.WriteLine((int)result);
}
catch (Exception e)
{
    Console.WriteLine("ERROR");
}

var g = (char)('f' + 1);
Console.WriteLine(g);

var s1 = "Hello";
var s2 = "world";
Console.WriteLine(s1 + ' ' + s2);
int i = 3;
int j = 5;
string s = "test", resultat;

resultat = i + j + s;
Console.WriteLine(resultat);
resultat = s + i + j;
Console.WriteLine(resultat);
