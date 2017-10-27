
package applied.or;

import java.io.IOException;

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
       test.setInputFile("C:\\TEST AOR\\EchteTest.xls");
       
       
       test.giveNurseNumber(14);
       test.giveBinaryDayPlanning(14);
       test.giveEmploymentRate(14);
       test.giveType(13);
       test.givePref(13);
        }

    } 

