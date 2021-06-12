package uz.pdp.override;

public class Admin extends Staff{
    @Override
    public void adjustSalary(int a) {
        System.out.println("The salary of Admin: " + a);
    }
    public void doAdmin(){

    }
}
