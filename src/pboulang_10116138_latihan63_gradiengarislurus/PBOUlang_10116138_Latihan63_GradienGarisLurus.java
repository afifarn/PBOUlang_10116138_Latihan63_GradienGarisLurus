/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan63_gradiengarislurus;

/**
 *
 * @author Aradnu
 */
public class PBOUlang_10116138_Latihan63_GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);

        System.out.println("Gradien Yang Melalui Titik (2,10) dan (5,7)"
                + "Memiliki Gradien Sebesar" + koordinat1.hitungGradien());

        System.out.println("Gradien Yang Melalui Titik (5,1) dan (3,12)"
                + "Memiliki Gradien Sebesar" + koordinat2.hitungGradien());
    }

}
