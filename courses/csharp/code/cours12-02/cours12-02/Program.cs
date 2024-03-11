Console.WriteLine(Absolute(-13));

Console.WriteLine(IsEven(3));
Console.WriteLine(IsEven(128));

 static string IsEven(int value)
 {
     
     return value % 2 == 0 ?  $"The number {value} is even" : $"The number {value} is odd";
 }

 static int Absolute(int value)
 {
     
     return value < 0 ? -value : value;
 }


// CalcultateTemperature(AskTemperature());


static int AskTemperature()
{
    Console.WriteLine("Quelle est la température ");
    return int.Parse(Console.ReadLine() ?? string.Empty);
}


 static void CalcultateTemperature(double temperature)
 {
     if (temperature < 0)
         Console.WriteLine("Portez manteau et gants");
     else if (temperature <= 15)
         Console.WriteLine("Portez un manteau");
     else if (temperature <= 20)
        Console.WriteLine("Portez une veste");
     else if (temperature <= 30)
         Console.WriteLine("Portez un T-Shirt");
     else
         Console.WriteLine("Portez un maillot");
 }

 TestAddition();

 static void TestAddition()
 {
     int i, j; 
     Random rng = new Random(); 
     i = rng.Next(1000); 
     j = rng.Next(1000);
     Console.WriteLine("Quelle est l'addition de " + i + " et " + j);
     if (int.Parse(Console.ReadLine() ?? string.Empty) == (i + j))
         Console.WriteLine("Good answer");
     else Console.WriteLine("Bad Answer, good answer was : " + (i + j));
 }
 

 var a = 5.0;
 var b = 2.0;
 var c = 1.0;
 bool hasRoots = CalculateQuadraticRoots(a, b, c);

 Console.WriteLine(hasRoots ? "L'équation a des racines." : "L'équation n'a pas de racines réelles.");
 static bool CalculateQuadraticRoots(double a, double b, double c)
 {
     double delta = Math.Pow(b, 2) - 4 * a * c;

     if (delta < 0)
     {
         Console.WriteLine("L'équation n'a pas de racines réelles.");
         return false;
     }

     double root1 = (-b - Math.Sqrt(delta)) / (2 * a);
     double root2 = (-b + Math.Sqrt(delta)) / (2 * a);

     if (delta == 0)
     {
         Console.WriteLine($"L'équation a une racine double: x = {root1}");
     }
     else
     {
         Console.WriteLine($"L'équation a deux racines réelles: x1 = {root1} et x2 = {root2}");
     }

     return true;
 }
