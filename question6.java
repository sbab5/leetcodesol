//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.
class Animal{
    void move(){
        System.out.println("Animal is moving");
    }

}
class cheetah extends Animal{
    @Override
    public void move(){
        System.out.println("chetah is moving");
    }
}



public class question6 {
    public static void main(String[] args) {
    Animal animal=new Animal();
    animal.move();
    cheetah chitaanh= new cheetah();
    chitaanh.move();

    
}
}
