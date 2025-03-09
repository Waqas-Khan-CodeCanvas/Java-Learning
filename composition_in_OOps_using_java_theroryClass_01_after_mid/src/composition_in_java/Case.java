package composition_in_java;

public class Case {

    private String model;
    private String  manufacture;
    private String  powerSupply;
    private Dimensions dimenstion;

    public Case(String model, String manufacture, String powerSupply, Dimensions dimenstion) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimenstion = dimenstion;
    }

    public  void powerbuttonPress(){
        System.out.println("power button press...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimenstion() {
        return dimenstion;
    }
}
