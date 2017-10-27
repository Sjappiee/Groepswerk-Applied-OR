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
 
    public static void main(String[] args) throws IOException {

    /*    Process process = new Process();
       Department depA = new Department ('A',32);
       process.read_personnel_characteristics('A',32);
       int x;
       for(x=0;x<depA.getAmountNurses();x++){
       System.out.println(process.personelNr[x] + '\n');
       }*/
       
       ExcellReader test = new ExcellReader ();
       test.setInputFile("C:\\Users\\stephan\\Documents\\NetBeansProjects\\Groepswerk-Applied-OR\\EchteTest.xls");
       
       test.giveNurseNumber(5);
       test.giveBinaryDayPlanning(5);
       test.giveEmploymentRate(5);
       test.giveType(5);
       test.givePref(5);
        }

    } 

