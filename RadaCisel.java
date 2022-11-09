/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttcmarconi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**  čísela k losování a zaznamenávání  */
class RadaCisel
{
    /** Vnitřní kolekce čísel */
    private ArrayList<Integer> cisla;
    /** Generátor náhodných čísel */
    private Random random;

    /** Vytvoří další čísla */
    public RadaCisel()
    {
        random = new Random();
        cisla = new ArrayList<Integer>();
    }

    /// <summary>
    /// Vylosuje nové číslo a uloží ho do kolekce
    /// </summary>
    /// <returns>Nové  číslo</returns>
    public int losuj()
    {
        
        Integer cislo = random.nextInt(100) + 1;
        cisla.add(cislo);
        return cislo;
    }

    /**
     *  Vrátí string -  výpis seřazených sudých čísel
     * @return výpis sudých čísel
     */
    public String vypisSuda()
    {
        String vysledek = " ";
        Collections.sort(cisla);
        for (int i : cisla)
            if (i%2 == 0){
                vysledek +=i + " ";
            }
        return vysledek.trim();
    
    }
    public String vypisLicha()
    {
        String vysledek = " ";
        Collections.sort(cisla);
        for (int i : cisla)
            if (i%2!=0){
            vysledek += i + " ";
            }
        return vysledek.trim();
    
    }
}





