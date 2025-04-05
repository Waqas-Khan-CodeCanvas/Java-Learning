package lecture_06;

public class Animal_overriding {
    public void sound(){
        System.out.println("Animal makes sound... ");
    }
}
class Cat extends Animal_overriding{
    @Override
    public void sound(){
        super.sound();
        System.out.println("cat meow meow..");

    }
}

