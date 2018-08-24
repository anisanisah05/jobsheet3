/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3;

/**
 *
 * @author NISAH~05
 */
public class penyewa {
     private String nama;
    private int id_penyewa;
    
     public penyewa (String nama, int id_penyewa){
         this.nama = nama;
         this.id_penyewa = id_penyewa;
     }
     public void info(){
         System.out.println("nama : "+this.nama);
         System.out.println("id_penyewa : "+ this.id_penyewa);
         
     }
}
