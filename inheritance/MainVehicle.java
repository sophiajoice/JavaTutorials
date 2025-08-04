import java.lang.Math;
import java.time.Year;

class Vehicle
{
    String brand;
    String model;
    int year;
    double basePrice;
    int age;

    Vehicle(String brand,String model,int year,double basePrice)
    {
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.basePrice=basePrice;
        this.age=Year.now().getValue()-year;
    }

    void displayInfo()
    {
        System.out.println("-----Basic Vehicle Info-----");
        System.out.println("The Brand is :"+brand);
        System.out.println("The Model : "+model);
        System.out.println("The year is : "+year);
        System.out.println("The Base Price is : INR "+basePrice);
    }
    double calculateResaleValue()
    {   
        double Resale_value=basePrice*(Math.pow(0.85, age));
        return Resale_value;
    }

}
class Car extends Vehicle
{
    int numberOfDoors;

    Car(String brand,String model,int year,double basePrice,int numberOfDoors)
    {
        super(brand, model, year, basePrice);
        this.numberOfDoors=numberOfDoors;
    }

    double calculateInsurance()
    {
        double insurance=(5000*basePrice)+(1000*numberOfDoors);
        return insurance;
    }
    double calculateMaintenanceCost()
    {
        double maintenanceCost=(3000*age)+(500*numberOfDoors);
        return maintenanceCost;
    }
    void displayInfo()
    {
        super.displayInfo();
        System.out.println();
        System.out.println("The Insurance is : INR "+calculateInsurance());
        System.out.println("The Maintenance cost is : INR "+calculateMaintenanceCost());
        System.out.println("The Resale Value is : INR "+calculateResaleValue());
    }

}
class Motorcycle extends Vehicle
{
    boolean hasSidecar;

    Motorcycle(String brand,String model,int year,double basePrice,boolean hasSidecar)
    {
        super(brand, model, year, basePrice);
        this.hasSidecar=hasSidecar;
    }

    double calculateInsurance()
    {
        double insurance=2500*basePrice;
        if(hasSidecar)
            insurance+=1500;
        return insurance;
    }
    double calculateMaintenanceCost()
    {
        double maintenanceCost=2000*age;
        if(hasSidecar)
            maintenanceCost+=1000;
        return maintenanceCost;
    }
    void displayInfo()
    {
        super.displayInfo();
        System.out.println();
        System.out.println("The Insurance is : INR "+calculateInsurance());
        System.out.println("The Maintenance cost is : INR "+calculateMaintenanceCost());
        System.out.println("The Resale Value is : INR "+calculateResaleValue());
    }

}
class MainVehicle
{
    public static void main(String[] args) 
    {
      Car v1=new Car("Lamborghini","Veneno",2013,10,2);
      Motorcycle v2=new Motorcycle("Royal Enfield","Classic 350",2023,20,false);
      System.out.println();
      System.out.println("-----Car Info-----");
      v1.displayInfo();
      System.out.println();
      System.out.println("-----Motorcycle Info-----");
      v2.displayInfo();

    }

    
}
