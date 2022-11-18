/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttcmarconi;

import java.util.ArrayList;
import java.util.Collections;

/**  čísela k zaznamenávání  */
class RadaCisel
{
    /** Vnitřní kolekce čísel */
    private ArrayList<Integer> cisla;

    /** Vytvoří další čísla */
    public RadaCisel()
    {
        cisla = new ArrayList<Integer>();
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





