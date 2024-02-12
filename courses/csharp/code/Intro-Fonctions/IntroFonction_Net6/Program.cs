// Série 1: fonctions sans paramètres
// ==================================

Console.WriteLine("Voici un triangle");
DessinerTriangle();

Console.WriteLine();
Console.WriteLine("Voici un sapin");
DessinerTriangle();
DessinerTriangle();
DessinerTriangle();

Console.WriteLine();

// Série 2: fonctions avec paramètres
// ==================================

AfficherBonDAchat("Potter", "Harry", 50);
AfficherBonDAchat("Granger", "Hermione", 100);

string nomDuDirecteur = "Dumbledore";
string prenomDuDirecteur = "Albus";
int montantCadeauDuDirecteur = 1000;
AfficherBonDAchat(nomDuDirecteur, prenomDuDirecteur, montantCadeauDuDirecteur);

// Série 3: fonctions avec renvoi de valeur
// =================================
int montantCadeauRon;
montantCadeauRon = CalculerMoyenne(50, 100);
AfficherBonDAchat("Weasley", "Ron", montantCadeauRon);

Console.WriteLine("Appuyez sur <enter> pour terminer...");
Console.ReadLine();

// Définitions des fonctions
// =========================
static void DessinerTriangle()
{
    Console.WriteLine("   *");
    Console.WriteLine("  ***");
    Console.WriteLine(" *****");
    Console.WriteLine("*******");
}

static void AfficherBonDAchat(string Nom, string Prenom, int Valeur)
// Affiche un bon d'achat établi aux nom et prénom de la personne, pour la valeur donnée
{
    Console.WriteLine("==========================================");
    Console.WriteLine("Bon d'achat d'une valeur de " + Valeur + " euros");
    Console.WriteLine("Etabli au nom de " + Prenom + " " + Nom);
    Console.WriteLine("==========================================");
}
static int CalculerMoyenne(int Nombre1, int Nombre2)
// Renvoie la moyenne des deux nombres, arrondie à l'entier inférieur
{
    int Resultat;
    Resultat = (Nombre1 + Nombre2) / 2;
    return Resultat;
}
