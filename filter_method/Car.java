package filter_method;

public class Car {
    private int vin;
    private String make;
    private String model;
    private String year;
    private double mileage;
    
    public Car(int vin, String make, String model, String year, double mileage) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
    public int getVin() {
        return vin;
    }
    public void setVin(int vin) {
        this.vin = vin;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public double getMileage() {
        return mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    

    
}
