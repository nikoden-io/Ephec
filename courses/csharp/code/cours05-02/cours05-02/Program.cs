// Console.WriteLine(Snowman(1, 2, 3));

static double Snowman(double radiusOne, double radiusTwo, double radiusThree)
{
    double snowmanSize = 0;
    snowmanSize += CalculateArea(radiusOne);
    snowmanSize += CalculateArea(radiusTwo);
    snowmanSize += CalculateArea(radiusThree);
    return snowmanSize;
}

static double CalculateArea(double radius)
{
    return Math.PI * Math.Pow(radius, 2);
}
//
// Console.WriteLine("Entrez un premier mot: ");
// string firstWord = Console.ReadLine() ?? string.Empty;
// Console.WriteLine("Entrez un second mot: ");
// string secondWord = Console.ReadLine() ?? string.Empty;
// Console.WriteLine(firstWord + " " + secondWord);


static int SaisirEntier(string input){
    Console.WriteLine(input);
    return int.Parse(Console.ReadLine() ?? string.Empty);
}

Console.WriteLine(SaisirEntier("Please enter your age"));

// static void PrintVisitCard()
// {
//     Console.WriteLine("Entrez votre nom: ");
//     string lastName = Console.ReadLine() ?? string.Empty;
//     
//     Console.WriteLine("Entrez votre prénom: ");
//     string firstName = Console.ReadLine() ?? string.Empty;
//     
//     Console.WriteLine("Entrez votre numéro de téléphone: ");
//     string phoneNumber = Console.ReadLine() ?? string.Empty;
//     
//     Console.WriteLine("Entrez votre rue: ");
//     string street = Console.ReadLine() ?? string.Empty;
//     
//     Console.WriteLine("Entrez votre ville: ");
//     string town = Console.ReadLine() ?? string.Empty;
//     
//     Console.ForegroundColor = ConsoleColor.Red;
//     Console.WriteLine("====<3==== VISIT CARD =====<3=============");
//     Console.ForegroundColor = ConsoleColor.White;
//     Console.WriteLine("      " + lastName + "      " + firstName + "     ");
//     Console.WriteLine("          N°   " + phoneNumber);
//     Console.WriteLine("      " + street +  ", " + town + "    ");
//     Console.ForegroundColor = ConsoleColor.Red;
//     Console.WriteLine("==========================================");
//     Console.ForegroundColor = ConsoleColor.White;
// }
//
// PrintVisitCard();