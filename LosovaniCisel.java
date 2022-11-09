/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttcmarconi;
import java.util.Scanner;
/**
 *
 * @author ou75o
 */
public class LosovaniCisel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        RadaCisel radaCisel = new RadaCisel();
        System.out.println("Budou losována čísla.");
        String volba = "0";
        // hlavní cyklus
        while (!(volba.equals("4")))
        {
            // výpis možností
            System.out.println("1 - Losovat číslo");
            System.out.println("2 - Vypsat sudá čísla");
            System.out.println("3 - Vypsat lichá čísla");
            System.out.println("4 - Konec");
            volba = sc.nextLine().trim();
            System.out.println();
            // reakce na volbu
            switch (volba)
            {
                case "1":
                    System.out.printf("Padlo číslo: %s\n", radaCisel.losuj());
                    break;
                case "2":
                    System.out.printf("Padla sudá čísla: %s\n", radaCisel.vypisSuda());
                    break;
                case "3":
                    System.out.printf("Padla lichá čísla: %s\n", radaCisel.vypisLicha());
                    break;
                case "4":
                        System.out.println("Konec programu.");
                        break;
                default:
                    System.out.println("Neplatná volba, zadejte prosím znovu.");
                    break;
            }
        }
    }
}


