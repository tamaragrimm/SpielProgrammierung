import java.util.Scanner;

public class SpielProgrammierung {
    public static void main(String[] args) {

        // Deklaration der zwei Spielervariablen
        int player = 0;
        int computer = 0;
        // Variablendeklaration für den Punktestand
        int punktePlayer = 0;
        int punkteComp = 0;

         // Ausgabe der Regeln
        System.out.println("Wir spielen Schere, Stein, Papier, Echse, Spock.");
        System.out.println("Wer zuerst 3 Punkte hat gewinnt.");
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("Regeln: ");
        System.out.println("Schere schneidet Papier");
        System.out.println("Papier bedeckt Stein");
        System.out.println("Stein zerquetscht Echse");
        System.out.println("Echse vergiftet Spock");
        System.out.println("Spock zertrümmert Schere");
        System.out.println("Schere köpft Echse");
        System.out.println("Echse frisst Papier");
        System.out.println("Papier widerlegt Spock");
        System.out.println("Spock verdampft Stein");
        System.out.println("Stein schleift Schere");
        System.out.println(" ");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

    }
}
