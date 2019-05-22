/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistipeli;

import java.util.ArrayList;
import java.util.Random;
import javafx.scene.control.Button;

/**
 *
 * @author juha
 */
public class MuistipeliToiminnallisuus {

    private final String[][] muistipeli;
    private final String[] merkit;
    private int painalluksia = 0;
    private final ArrayList<String> arvaukset;
    private ArrayList<Button> napit;

    public MuistipeliToiminnallisuus() {
        this.merkit = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "a", "b", "c", "d", "e", "f", "g", "h"};
        this.muistipeli = populate(4);
        this.arvaukset = new ArrayList<>();
    }

    private String[][] populate(int monta) {
        String[][] lista = new String[monta][monta];
        int i = 0;
        while (true) {            
            int rivi = random();
            int sarake = random();            
            if (onkoListaTaysu(lista) == false) {
                    if (onkoPaikassaArvo(rivi, sarake, lista) == false) {                        
                        lista[rivi][sarake] = merkit[i];                        
                        i++;
                    }
            } else if (onkoListaTaysu(lista) == true) {
                break;
            }
        }

        return lista;
    }

    public String getMerkki(int rivi, int sarake) {
        return this.muistipeli[rivi][sarake];
    }

    public int getPainallukset() {
        return this.painalluksia;
    }

    public int pelaa(int rivi, int sarake, Button nimi) {
        this.arvaukset.add(rivi + ","+ sarake + "," + this.muistipeli[rivi][sarake]);
        this.painalluksia++;

        if (painalluksia > 2) {
            if (testaaKaksiArvoa(this.arvaukset) == true) {
                this.arvaukset.clear();
                this.painalluksia = 0;
                return 3;
            } else {
                this.arvaukset.clear();
                this.painalluksia = 0;
                return 2;
            }
        }
        return 1;
    }

    private boolean testaaKaksiArvoa(ArrayList lista) {
        ArrayList<String> arvot = lista;

        String arvo1 = arvot.get(0);
        String[] arvo1Split = arvo1.split(",");

        String arvo2 = arvot.get(1);
        String[] arvo2Split = arvo2.split(",");

        if (!arvo1Split[0].equals(arvo2Split[0]) || !arvo1Split[1].equals(arvo2Split[1])) {
            return arvo1Split[2].equals(arvo2Split[2]);           
        } else {
            return false;
        }
    }
    
    private int random() {
        Random random = new Random();
        return random.nextInt(4);
    }
    
    private boolean onkoPaikassaArvo(int rivi, int sarake, String[][] lista) {       
        return lista[rivi][sarake] != null;
    }
    
    private boolean onkoListaTaysu(String[][] lista) {
        boolean onkoTaysi = true;
        for (int rivi = 0; rivi < lista.length; rivi++){
            for (int sarake = 0; sarake < lista[rivi].length; sarake++) {
                if (lista[rivi][sarake] == null) {
                    onkoTaysi = false;
                }
            }
        }
        return onkoTaysi;
    }

}
