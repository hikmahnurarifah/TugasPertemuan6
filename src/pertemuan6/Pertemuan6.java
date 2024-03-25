/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Hikmah
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // persegi panjang 1
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        System.out.println("Luas persegi panjang dengan panjang " + persegiPanjang1.panjang + " dan lebar "
                + persegiPanjang1.lebar + " adalah " + persegiPanjang1.getLuas());
        System.out.println("Keliling persegi panjang adalah " + persegiPanjang1.getKeliling() + "\n");
        
        // persegi panjang 2
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        System.out.println("Luas persegi panjang dengan panjang " + persegiPanjang2.panjang + " dan lebar "
                + persegiPanjang2.lebar + " adalah " + persegiPanjang2.getLuas());
        System.out.println("Keliling persegi panjang adalah " + persegiPanjang2.getKeliling() + "\n");
        
        // persegi panjang 3
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);
        System.out.println("Luas persegi panjang dengan panjang " + persegiPanjang3.panjang + " dan lebar "
                + persegiPanjang3.lebar + " adalah " + persegiPanjang3.getLuas());
        System.out.println("Keliling persegi panjang adalah " + persegiPanjang3.getKeliling());
        
    }
    
}
