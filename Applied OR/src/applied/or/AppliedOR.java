
package applied.or;

public class AppliedOR {
 
    public static void main(String[] args) {
        Process process = new Process();
       Department depA = new Department ('A',32);
       process.read_personnel_characteristics('A',32);
       int x;
       for(x=0;x<depA.getAmountNurses();x++){
       System.out.println(process.personelNr[x] + '\n');
       }  
    } 
}
