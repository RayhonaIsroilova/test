package uz.pdp.override;

public class Academic extends Staff{
    @Override
    public void adjustSalary(int a) {
        System.out.println("The salary of Academic: " + a);
    }
    public void doStaff(){

    }
}
