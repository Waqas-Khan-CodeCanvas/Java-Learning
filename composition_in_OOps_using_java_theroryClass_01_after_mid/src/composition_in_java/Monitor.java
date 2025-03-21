package composition_in_java;

public class Monitor {

    private  String model;
    private  String manufacture;
    private  int size;
    private  Resolution mativeResolution;

    public Monitor(String model, String manufacture, int size, Resolution mativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.mativeResolution = mativeResolution;
    }

    public void drwPlixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "+x+" , "+y+" in color "+color);
    }
    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getMativeResolution() {
        return mativeResolution;
    }

}
