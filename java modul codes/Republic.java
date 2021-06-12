package uz.pdp.extratasksforrepublic;

import java.util.Arrays;

public class Republic extends Area {
   private  Regions[] regions;
   private President president;


   public Republic() {
   }

   public Republic(Regions[] regions,President president) {
      this.regions = regions;
      this.president = president;
   }

   public Republic(String areaName, double areSize, long areaPopulation, Regions[] regions) {
      super(areaName, areSize, areaPopulation);
      this.president = president;
      this.regions = regions;
   }

   public President getPresident() {
      return president;
   }

   public void setPresident(President president) {
      this.president = president;
   }

   public Regions[] getRegions() {
      return regions;
   }

   public void setRegions(Regions[] regions) {
      this.regions = regions;
   }

   @Override
   public String toString() {
      return "Republic{" +
              "president=" + president +
              ", regions=" + Arrays.toString(regions) +
              "} " + super.toString();
   }
}
