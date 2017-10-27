
package applied.or;

import java.util.ArrayList;
import java.util.Arrays;

public class Nurse {
    
    private int nr;
    private String preference;
    private int type;
    private float employmentRate;
    private int [] [] binaryDayPlanning; 

    public Nurse(int nr, String preference, int type, float employmentRate) {
        this.nr = nr;
        this.preference = preference;
        this.type = type;
        this.employmentRate = employmentRate;
        binaryDayPlanning = new int [7] [];//elke dag 2 opties
    }

    public Nurse() {
    }
    
    
   
}
