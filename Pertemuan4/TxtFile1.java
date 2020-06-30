/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

import Pertemuan4.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mujawa_
 */
public class TxtFile1 {
    public static void main(String[]args) throws FileNotFoundException, IOException {
        
        //READTXT FILE
    String FileName = "D://Input.txt";// path
    String baris = null;
    
    
    //Adalah CLASS. //OBJEK
    FileReader fileReaderjoss
            = new FileReader (FileName);
    
    BufferedReader bufferedReader
            = new BufferedReader (fileReaderjoss);
    
    while ((baris = bufferedReader.readLine()) != null) {
        System.out.println(baris);
        
    }
    bufferedReader.close();
    }            
}
