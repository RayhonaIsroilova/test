package uz.pdp.extratasksforrepublic;

public class District extends Area{
    private  Khokim khomkim;

    @Override
    public void printInfo() {
        System.out.println("The Khokim of district is begin working as a Khokim in 2004.");
        System.out.println("The district located in ... region.");
    }

    public District() {
        super();
    }

    public District(String areaName, double areSize, long areaPopulation) {
        super(areaName, areSize, areaPopulation);
    }

    @Override
    public String getAreaName() {
        return super.getAreaName();
    }

    @Override
    public void setAreaName(String areaName) {
        super.setAreaName(areaName);
    }

    @Override
    public double getAreSize() {
        return super.getAreSize();
    }

    @Override
    public void setAreSize(double areSize) {
        super.setAreSize(areSize);
    }

    @Override
    public long getAreaPopulation() {
        return super.getAreaPopulation();
    }

    @Override
    public void setAreaPopulation(long areaPopulation) {
        super.setAreaPopulation(areaPopulation);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
