
package applied.or;

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

