
package applied.or;

public class Department {
    private int amountNurses;
    private char department;
    
    public Department (char dep,int amount){
        this.amountNurses = amount;
        this.department = dep;
    }

    public void setAmountNurses(int amountNurses) {
        this.amountNurses = amountNurses;
    }

    public void setDepartment(char department) {
        this.department = department;
    }

    public int getAmountNurses() {
        return amountNurses;
    }

    public char getDepartment() {
        return department;
    }
    
    
}
