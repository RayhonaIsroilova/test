package uz.pdp.extratasksforrepublic;

public class Area {
     private String AreaName;
     private double AreSize;
     private long AreaPopulation;

     public void printInfo(){
         System.out.println("This republic or region or district ");
         System.out.println("are located .... and their neighbour republics or regions or district ");
         System.out.println("are .... . the president or khokim  is working this place during ... year!");
     }

    public Area() {
    }

    public Area(String areaName, double areSize, long areaPopulation) {
        AreaName = areaName;
        AreSize = areSize;
        AreaPopulation = areaPopulation;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String areaName) {
        AreaName = areaName;
    }

    public double getAreSize() {
        return AreSize;
    }

    public void setAreSize(double areSize) {
        AreSize = areSize;
    }

    public long getAreaPopulation() {
        return AreaPopulation;
    }

    public void setAreaPopulation(long areaPopulation) {
        AreaPopulation = areaPopulation;
    }

    @Override
    public String toString() {
        return "Area{" +
                "AreaName='" + AreaName + '\'' +
                ", AreSize=" + AreSize +
                ", AreaPopulation=" + AreaPopulation +
                '}';
    }
}
