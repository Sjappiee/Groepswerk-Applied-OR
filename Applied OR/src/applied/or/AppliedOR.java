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
    
    //for array lentghs, niet nodig in java (?)
    //int maxNurses = 100;
    //int maxDays = 28;
    //int maxTypes = 2;
    //int maxShifts = 5;
    
    //variables
    int k,m,i,j;
    int amountShifts, lengthShifts, amoundDays, amountNurses;
    // arrays
    int [] startShifts;
    int [] endShifts;
    int [] hrs;
    int[] shifts;
    int [][] req;
    String [] personelNr;

 void read_shift_system(char department){
      
        String fileName="files/Shift_system_dpt_" + department + ".txt";

        Scanner inputStream=null;
       try{
            inputStream=new Scanner(new File(fileName));
            // text bestand: zorgen dat dit overeenkomt met onderstaande volgorde
            int line1= Integer.parseInt(inputStream.nextLine());
            int line2= Integer.parseInt(inputStream.nextLine());
            amountShifts = line1;
            lengthShifts = line2;
            
            //starttijden shifts inlezen en coderen, ik snap het vb hiervan niet goed
            /*SHIFT ENCODING SYSTEM*/
    /* Early shift		Code 0
       Day shift		Code 1
       Late shift		Code 2
       Night shift		Code 3
       Day off			Code 4*/
            
            //eindtijden shifts bepalen
            for (m = 1; m <= amountShifts; m++){
                if (startShifts[m]+lengthShifts < 24)
                {
                    hrs[shifts[m]] = lengthShifts;
                    endShifts[m] = startShifts[m] + lengthShifts;
                }
                else
                {
                    hrs[shifts[m]] = lengthShifts;
                    endShifts[m] = hrs[shifts[m]]+startShifts[m]-24;
                }
            }
            
            // The free shift contains no duty time
            hrs[shifts[0]] = 0;
    
    // Copy staffing requirements to the other days
             for (i = 1; i < amoundDays; i++){
                for (j = 0; j <= amountShifts; j++)
                    req[i][shifts[j]] = req[0][shifts[j]];
            }
    
    // Increase the number of shifts by one as a day off is also considered as a shift, i.e. the free shift
            amountShifts++;
                
            inputStream.close();
       }
        catch(FileNotFoundException e){
            System.out.println("Problem with opening file: "+fileName);
        }
       catch(IOException e){
           System.out.println("Problem with input from file: "+fileName);
       }
 }
 
 void read_personnel_characteristics(char department){
     
        String fileName="files/Personnel_dpt_" + department + ".txt";
        
        Scanner inputStream=null;
       try
        {
            inputStream=new Scanner(new File(fileName));
            for (k = 0; k < amountNurses; k++){
            personelNr[k] = inputStream.next(); //test: bij k=0, kijken of hij bij 1ste string start of door de "next" direct naar de volgende gaat)
            
            }
            inputStream.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Problem with opening file: "+fileName);
        }
       catch(IOException e)
       {
           System.out.println("Problem with input from file: "+fileName);
       }
     
 }

         
void read_input(char department){
    read_shift_system(department);						// Read the characteristics of the shift system
    
    for (k = 0; k < number_nurses; k++)			// Initialise cyclic roster
    {	for (i = 0; i < amoundDays; i++)
        cyclic_roster[k][i] = 0;
    }
    
    read_cyclic_roster(department);						// Read the cyclic roster for the personnel member
    read_personnel_characteristics(department);			// Read the characteristics of the employed personnel
    read_monthly_roster_rules(department);				// Read the constraint set for constructing a monthly roster
    number_shifts = 5;							// Set the number of shifts to 5 in order to meet the input data
    
    fclose(input);
}
    
    public static void main(String[] args) {
       
        
        
    }
    
}
