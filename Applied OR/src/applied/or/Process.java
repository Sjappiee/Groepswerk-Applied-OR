
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
    int k,i,j,l,m;
    
    int amountShifts, lengthShifts, amountDays, amountNurses;
    // arraysLists
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
        personelNr = new String[AmountNurses];
        pref = new int [AmountNurses][28][5];
        nurseEmployment = new float[AmountNurses];
        nurseType = new int [AmountNurses];

       try{
            inputStream=new Scanner(new File(fileName));
            k=0;
            while(inputStream.hasNextLine()){
                String data = inputStream.nextLine();
                String [] array = data.split(";");
                String x = array[0];
                personelNr[k] = x;
                try{
                    int day ;
                    m=0;
                    for(day = 0; day<28;day++){
                        for(j=0;j<5;j++){
                           int w = Integer.parseInt(array[m+1]);
                           pref[k][day][j] = w;
                           m+=1;
                        }
                    }
                    float v = Float.parseFloat(array[141]);
                    nurseEmployment[k] = v;
                    int u = Integer.parseInt(array[142]);
                    nurseType[k] = u;                
                    k+=1;
                }
                 catch(NumberFormatException e){
                System.out.println("Problem with parsing");
                }
            }
            inputStream.close();
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
