/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Hikmah
 */
public class PersegiPanjang {
    
    
    int panjang;
    int lebar;
    
    PersegiPanjang()
    {
        panjang = 1;
        lebar = 1;
    }
    
    PersegiPanjang(int panjangBaru, int lebarBaru)
    {
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    int getLuas()
    {
        return panjang * lebar;
    }
    
    int getKeliling()
    {
        return 2 * (panjang+lebar);
    }
    
    void setLebar(int lebarBaru)
    {
        lebar = lebarBaru;
    }
    
    
    void setPanjang(int panjangBaru)
    {
        panjang = panjangBaru;
    }
    
    
}