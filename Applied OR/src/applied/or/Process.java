
package applied.or;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {
       
    //for array lentghs, niet nodig in java (?)
    //int maxNurses = 100;
    //int maxDays = 28;
    //int maxTypes = 2;
    //int maxShifts = 5;
    
    //variables
    int k,i,j,l;
    
    int amountShifts, lengthShifts, amountDays, amountNurses;
    // arrays
    int [] startShifts;
    int [] endShifts;
    int [] hrs;
    int[] shifts;
    int [] nurseType;
    int [][] req;
    int [][][] pref;
    String [] personelNr;
    float [] nurseEmployment;

// void read_shift_system(char department){
//      
//        String fileName="Shift_system_dpt_" + department + ".csv";
//
//        Scanner inputStream=null;
//       try{
//            inputStream=new Scanner(new File(fileName));
//            // text bestand: zorgen dat dit overeenkomt met onderstaande volgorde
//            int line1= Integer.parseInt(inputStream.nextLine());
//            int line2= Integer.parseInt(inputStream.nextLine());
//            amountShifts = line1;
//            lengthShifts = line2;
//            
//            //starttijden shifts inlezen en coderen, ik snap het vb hiervan niet goed
//            /*SHIFT ENCODING SYSTEM*/
//                /* Early shift		Code 0
//                   Day shift		Code 1
//                   Late shift		Code 2
//                   Night shift		Code 3
//                   Day off		Code 4*/
//            
//            for (m = 1; m <= amountShifts; m++){            //eindtijden shifts bepalen
//                if (startShifts[m]+lengthShifts < 24)
//                {
//                    hrs[shifts[m]] = lengthShifts;
//                    endShifts[m] = startShifts[m] + lengthShifts;
//                }
//                else
//                {
//                    hrs[shifts[m]] = lengthShifts;
//                    endShifts[m] = hrs[shifts[m]]+startShifts[m]-24;
//                }
//            }
//      
//            hrs[shifts[0]] = 0;         // The free shift contains no duty time
//    
//             for (i = 1; i < amountDays; i++){              // Copy staffing requirements to the other days
//                for (j = 0; j <= amountShifts; j++)
//                    req[i][shifts[j]] = req[0][shifts[j]];
//            }
//             
//            amountShifts++;         // Increase the number of shifts by one as a day off is also considered as a shift, i.e. the free shift
//                
//            inputStream.close();
//       }
//        catch(FileNotFoundException e){
//            System.out.println("Problem with opening file: "+fileName);
//        }
//       catch(IOException e){
//           System.out.println("Problem with input from file: "+fileName);
//       }
// }
 
 void read_personnel_characteristics(char department,int nurses){
     
        String fileName="C:\\Users\\Admin\\Documents\\_2de master\\applied OR bestanden\\Personnel_dpt_" + department + ".csv";
        int AmountNurses = nurses;
        Scanner inputStream=null;
        String [] values = null;
       try{
            inputStream=new Scanner(new File(fileName));
            while(inputStream.hasNext()){
                String data = inputStream.next();
                values = data.split(",");
            }
            inputStream.close();
            
            try{
                k=0;
                l = 0;
                int aantalCellen = AmountNurses*(28*5+2);
                while(k<aantalCellen){
                    personelNr[l] = values[k];
                    for(i=0;i<35;i++){
                        if(i<29){
                            for(j=0;j<5;j++){
                               pref[l][i][j] = Integer.parseInt(values[k+i+j]);
                            }
                        }
                        if(i==33){
                           nurseEmployment[l] = Float.parseFloat(values [k+i]);
                        }
                        if (i==34){
                           nurseType[l] =  Integer.parseInt(values[k+i]);
                        }
                    } 
                    k = k + 1 + 34;
                    l+=1;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Problem with parsing");
            }
       }
       catch(FileNotFoundException e){
            System.out.println("Problem with opening file: "+fileName);
       }
       catch(IOException e){
           System.out.println("Problem with input from file: "+fileName);
       }
 }

         
//void read_input(char department){
//    read_shift_system(department);						// Read the characteristics of the shift system
//    
//    for (k = 0; k < number_nurses; k++)			// Initialise cyclic roster
//    {	for (i = 0; i < amoundDays; i++)
//        cyclic_roster[k][i] = 0;
//    }
//    
//    read_cyclic_roster(department);						// Read the cyclic roster for the personnel member
//    read_personnel_characteristics(department);			// Read the characteristics of the employed personnel
//    read_monthly_roster_rules(department);				// Read the constraint set for constructing a monthly roster
//    number_shifts = 5;							// Set the number of shifts to 5 in order to meet the input data
//    
//    fclose(input);
//}
    
}
