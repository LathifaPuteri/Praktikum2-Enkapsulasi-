/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2.enkapsulasi;

/**
 *
 * @author MOKLET-2
 */
public class UjiBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double jarijari = 14;
        Bola bola = new Bola(10);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        System.out.println("");
        
        bola.setJarijari(jarijari);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }
    
}
