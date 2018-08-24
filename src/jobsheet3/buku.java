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
class buku extends penyewa{
     private String namaBuku;
     private int idBuku;
 public buku (String namaBuku,int idBuku, String nama, int id_penyewa){
     super(nama,id_penyewa);
     this.namaBuku = namaBuku;
     this.idBuku= idBuku;
 }
 public void info(){
     System.out.println("  -- DATA PERPUSTAKAAN SEKOLAH --");
     System.out.println("nama buku : "+ this.namaBuku);
     System.out.println("id buku : "+ this.idBuku);
     super.info();
 }
}
