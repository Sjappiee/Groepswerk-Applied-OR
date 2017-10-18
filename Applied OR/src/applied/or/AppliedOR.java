/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applied.or;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author stephan
 */
public class AppliedOR {
 
    public static void main(String[] args) {
        Process process = new Process();
       Department depA = new Department ('A',32);
       process.read_personnel_characteristics('A');
       int x;
       for(x=0;x<depA.getAmountNurses();x++){
       System.out.println(process.personelNr[x] + '\n');
       }  
    } 
}
