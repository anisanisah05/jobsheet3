/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author NISAH~05
 */
public class B extends A{
    private int b;
    public void setB(int nilai){
        b= nilai;
    }
    public int getB(){
        return b;
    }
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("nilai b: "+ getB());
    }
}
