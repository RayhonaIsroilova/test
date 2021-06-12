package uz.pdp.override;

public class Staff extends  Payroll{
    private String name;
    private String salary;

    @Override
    public void adjustSalary(int a) {
        System.out.println("The salary of Staff:" + a);
    }
}
