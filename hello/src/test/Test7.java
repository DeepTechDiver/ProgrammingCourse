package test;


/**
 * 类 的 继承，多态，多接口 特性介绍
 */
class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}
/**
 * 一个子类只能继承一个父类：
 * 在Java中，关键字extends用于创建类的继承关系。
 * Dog类继承了Animal类，表明 "Dog类是Animal类的子类" 或派生类。
 * 通过继承，Dog类可以继承Animal类中的属性和方法。
 */
class Dog extends Animal{
    //子类对父类中的 move 方法进行重写
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

interface Jumpable {
    void jump();
}
interface squat {
    void squat();
}
/**
 * 一个类可以实现多个接口，从而获得多个接口定义的方法。
 * 通过接口（interface）可以实现类似于多重继承的功能。接口定义了一组方法的规范没有具体的实现。
 */
class JumpingDog extends Animal implements Jumpable, squat {
    public void move() {
        System.out.println("狗可以跑和走");
    }

    public void bark() {
        System.out.println("狗可以吠叫");
    }

    public void jump() {
        System.out.println("狗可以跳跃");
    }
    public void squat() {
        System.out.println("狗可以下蹲");
    }
}

public class Test7{
    public static void main(String args[]){

        /**
         * test--1
         * 由于Dog类是Animal类的子类，因此可以用Dog类的对象引用来引用Animal类的对象。这就体现了多态的特性，即父类类型的引用可以指向子类对象。
         */
        Animal a = new Animal(); // 创建了一个Animal类的对象a
        Animal b = new Dog(); // 创建了一个Dog类的对象b
        a.move();// 执行 test.Animal 类的方法

        /**
         * test--2
         * 由于b是Dog类的引用,调用的是Dog类中重写（覆盖）了Animal类的move方法
         */
        b.move();//执行 test.Dog 类的方法
        // b.bark();//此处报错，因为引用类型Animal没有bark方法,b 应该引用Dog的类。

        /**
         * test--3
         * 将b的类型更改为Dog
         */
        Dog b2 = new Dog();
        b2.bark();

        /**
         * test--4
         * 一个类可以实现多个接口，从而获得多个接口定义的方法。
         */
        JumpingDog jumpingDog = new JumpingDog();
        jumpingDog.bark();
        jumpingDog.jump(); // 调用 Dog 类实现的 jump() 方法
        jumpingDog.squat(); //调用 Dog 类实现 squat() 方法
    }
}