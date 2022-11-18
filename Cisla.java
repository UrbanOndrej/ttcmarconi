/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttcmarconi;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ou75o
 */
public class Cisla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        RadaCisel radaCisel = new RadaCisel();
        System.out.println("Zadejte libovolný počet celých kladných čísel :");
        String cisla;
        String volba = "0";
        // hlavní cyklus
        while (!(volba.equals("3")))
        
            // výpis možností
            System.out.println("1 - Vypsat sudá čísla:");
            System.out.println("2 - Vypsat lichá čísla:");
            System.out.println("3 - Konec ");
            volba = sc.nextLine().trim();
            System.out.println();
            // reakce na volbu
            switch (volba)
            {
                case "1":
                    System.out.printf("Zadaná sudá čísla: %s\n", radaCisel.vypisSuda());
                    break;
                case "2":
                    System.out.printf("Zadaná lichá čísla: %s\n", radaCisel.vypisLicha());
                    break;
                case "3":
                    System.out.println("Konec programu.");
                    break;
                default:
                    System.out.println("Neplatná volba, zadejte prosím znovu.");
                    break;
            }
        }
    }



