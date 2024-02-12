using cours29_01;

var booleanOperators = new BooleanOperatorsClass();

booleanOperators.LogBoolOperators();
booleanOperators.LogDeMorgan();
Console.WriteLine(BooleanOperatorsClass.CalculatePerimeter(12.4, 8.2));
Console.WriteLine(BooleanOperatorsClass.CalculateCircumference(14.8));
Console.WriteLine(BooleanOperatorsClass.CalculateArea(13.2));
Console.WriteLine(BooleanOperatorsClass.CalculateArea(13.2));

var functionClass = new FunctionsClass();

Console.WriteLine("Voici un triangle");
functionClass.DessinerTriangle();

Console.WriteLine();
Console.WriteLine("Voici un sapin");
functionClass.DessinerTriangle();
functionClass.DessinerTriangle();
functionClass.DessinerTriangle();

Console.WriteLine();

functionClass.AfficherBonDAchat("Potter", "Harry", 50);
functionClass.AfficherBonDAchat("Granger", "Hermione", 100, "Special Guest");

var nomDuDirecteur = "Dumbledore";
var prenomDuDirecteur = "Albus";
var montantCadeauDuDirecteur = 1000;
functionClass.AfficherBonDAchat(nomDuDirecteur, prenomDuDirecteur, montantCadeauDuDirecteur);

int montantCadeauRon;
montantCadeauRon = functionClass.CalculerMoyenne(50, 100);
functionClass.AfficherBonDAchat("Weasley", "Ron", montantCadeauRon);
functionClass.AfficherCarteViste("Weasley", "Ron", "0477898989", "Liberty Street", "Nivelles");