
package applied.or;

import java.util.ArrayList;
import java.util.Arrays;

public class Nurse {
    
    private int nr;
    private String preferenceText;
    private int type;
    private float employmentRate;
    private int [] [] binaryDayPlanning; 
    private int [][] preferences;

    public Nurse(int nr, String preferenceText, int type, float employmentRate) {
        this.nr = nr;
        this.preferenceText = preferenceText;
        this.type = type;
        this.employmentRate = employmentRate;
        binaryDayPlanning = new int [7] [];//elke dag 2 opties
    }

    public Nurse() {
    }
    
    
   
}
