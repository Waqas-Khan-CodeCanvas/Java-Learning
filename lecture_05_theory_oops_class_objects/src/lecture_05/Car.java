package lecture_05;

public class Car {
    private String carName;
    private String carColor;
    private int carModel;
    private int carPrice;

    public Car(String name){
        this.carName=name;
    }
//    public  void setCarName(String name){
//        carName=name;
//    }
    public  void setCarColor(String color){
        carColor=color;
    }
    public  void setCarModel(int model){
        carModel=model;
    }
    public  void setCarPrice(int price){
        carPrice=price;
    }

    //geter funtions
    public  void  getCarName(){
        System.out.println("The car name is : "+carName);
    }
    public  void getCarColor(){
        System.out.println("The car color is : "+carColor);
    }
    public  void getCarModel(){
        System.out.println("The car model is : "+carModel);
    }
    public  void getCarPrice(){
        System.out.println("The car pices is : "+carPrice);
    }
}
