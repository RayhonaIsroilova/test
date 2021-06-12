package uz.pdp.extratasksforrepublic;

public class Regions extends Area{
    private Khokim khokim;
    private District[] districts;

    @Override
    public void printInfo() {
        System.out.println("The Khokim of region begin working as a region Khokim in 2013-year!");
    }

    public Regions() {
        super();
    }

    public Regions(String areaName, double areSize, long areaPopulation) {
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
