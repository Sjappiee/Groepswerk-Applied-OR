
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
       
       test.giveNurseNumber(31);
       test.giveBinaryDayPlanning(31);
       test.giveEmploymentRate(31);
       test.giveType(31);
       test.givePref(31);
        }

    } 

