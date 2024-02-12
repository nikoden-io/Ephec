namespace cours29_01;

public class FunctionsClass
{
    public void DessinerTriangle()
    {
        Console.ForegroundColor = ConsoleColor.Green;
        Console.WriteLine("   *");
        Console.WriteLine("  ***");
        Console.WriteLine(" *****");
        Console.WriteLine("*******");
        Console.ForegroundColor = ConsoleColor.White;
    }

    public void AfficherBonDAchat(string Nom, string Prenom, int Valeur, string OffertPar = "Test")
    {
        Console.WriteLine("==========================================");
        Console.WriteLine("Bon d'achat d'une valeur de " + Valeur + " euros");
        Console.WriteLine("Etabli au nom de " + Prenom + " " + Nom);
        Console.WriteLine("Offert par " + OffertPar);
        Console.WriteLine("==========================================");
    }

    public int CalculerMoyenne(int Nombre1, int Nombre2)
    {
        int Resultat;
        Resultat = (Nombre1 + Nombre2) / 2;
        return Resultat;
    }
    
    public void AfficherCarteViste(string Nom, string Prenom, string NumeroTelephone, string Rue, string Ville)
    {
        Console.ForegroundColor = ConsoleColor.Red;
        Console.WriteLine("====<3==== VISIT CARD =====<3=============");
        Console.ForegroundColor = ConsoleColor.White;
        Console.WriteLine("      " + Nom + "      " + Prenom + "     ");
        Console.WriteLine("          N°   " + NumeroTelephone);
        Console.WriteLine("      " + Rue +  ", " + Ville + "    ");
        Console.ForegroundColor = ConsoleColor.Red;
        Console.WriteLine("==========================================");
        Console.ForegroundColor = ConsoleColor.White;
    }
}