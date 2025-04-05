package thirdLecture_03;

public class Car {
    private String model;
    private String color;
    // Constructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    // Getter for model
    public String getModel() {
        return model;
    }
    // Setter for model with validation
    public void setModel(String model) {
        if(model.equals("Porche") || model.equals("Corolla")) {
            this.model = model;
        } else {
            this.model = "Unknown Model";
        }
    }
    // Getter for color
    public String getColor() {
        return color;
    }
}
