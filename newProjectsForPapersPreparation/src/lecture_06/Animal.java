package lecture_06;

public class Animal {
    public String age;
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("Animals can eat..");
    }
}
class Dog extends Animal{
    public String name;
    public Dog(String name){
        super();
        this.name=name;
    }
    public void bark(){
        System.out.println("Dog is barking..");
    }
}
