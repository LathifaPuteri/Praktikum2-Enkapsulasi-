/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2.enkapsulasi;
import java.lang.Math;
/**
 *
 * @author MOKLET-2
 */
public class Bola {
   private double jarijari;
   public Bola(double jarijari){
       this.jarijari = jarijari;
   }
   //method void untuk set jari-jari
   public void setJarijari (double jarijari){
       this.jarijari = jarijari;
   }
   //method void untuk menghitung diameter
   public void showDiameter(){
       System.out.println("Diameter = "+2*jarijari);
   }
   //method void untuk menghitung luas permukaan bola
   public void showLuasPermukaan(){
       System.out.println("Luas Permukaan Bola = "+4*Math.PI*(jarijari)*(jarijari));
   }
   //method void untuk menghitung volume bola
   public void showVolume(){
       System.out.println("Volume Bola = "+4/3*Math.PI*(jarijari)*(jarijari)*(jarijari));
   }
}
