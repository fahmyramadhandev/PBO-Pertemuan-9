/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ramadhanfahmy6
 */
public class HitungHari {
    public int hitung(int tahun,int bulan){
        switch (bulan) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            
            case 4: case 6: case 9: case 11:
                return 30;
            
            case 2:
                if (cekKabisat(tahun)) return 29;
                else return 28;
            default:
                return 0;
        }
    }
    
    private boolean cekKabisat(int tahun){
        return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
    }
}
