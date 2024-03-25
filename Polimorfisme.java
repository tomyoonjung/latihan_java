/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
    class hewan {
        public void suara(){
        System.out.println("hewan bersuara : ");
        }
    }
    class kuda extends hewan {
        public void suara(){
        System.out.println("Kuda mengikik : ");
        }
    }
    class kucing extends hewan {
        public void suara(){
        System.out.println("Kucing mengeong : ");
        }
    }
    class ayam extends hewan {
        public void suara(){
        System.out.println("Ayam berkokok : ");
        }
    }
    public class Polimorfisme {
        public static void main(String[] args){
        hewan Hewan = new hewan();
        kuda Kuda = new kuda();
        kucing Kucing = new kucing();
        ayam Ayam = new ayam();
        
        Hewan.suara();
        
        Hewan = Kuda;
        Hewan.suara();
        
        Hewan = Kucing;
        Hewan.suara();
        
        Hewan = Ayam;
        Hewan.suara();
        }
    }

        
        