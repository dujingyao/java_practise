package experiment.No2;
/*
私有属性name（表示动物的名字，字符串类型）。
私有属性age（表示动物的年龄，整数类型）。
构造方法，用于初始化name和age属性。
公有的get方法和set方法，分别用于获取和设置name和age属性的值。
抽象方法makeSound()，该方法没有具体实现，用于表示动物发出声音的行为（不同动物发出的声音不同，所以定义为抽象方法）。
1）创建两个子类Dog和Cat，分别继承自Animal类，并实现以下要求：
在Dog类中：
实现makeSound()方法，使其打印出 “汪汪汪”。
增加一个私有属性breed（表示狗的品种，字符串类型）。
提供构造方法，用于初始化name、age和breed属性。
提供公有的get方法和set方法，用于获取和设置breed属性的值。
在Cat类中：
实现makeSound()方法，使其打印出 “喵喵喵”。
增加一个私有属性color（表示猫的颜色，字符串类型）。
提供构造方法，用于初始化name、age和color属性。
提供公有的get方法和set方法，用于获取和设置color属性的值。
在主类中创建Dog和Cat的对象，并分别调用它们的makeSound()方法和属性的get方法，展示其功能。
2）创建了Dog和Cat的对象，并调用了它们的方法和属性，展示了类的继承和多态性的应用。
*/
abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    abstract void makeSound();

}

class Dog extends Animal{
    private String breed;
    // 重写构造方法，用于初始化name、age和breed属性。
    public Dog(String name, int age, String breed) {
        //其中super关键字用于调用父类的构造方法，初始化从父类继承的属性name和age。
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    // 实现makeSound()方法，使其打印出 “汪汪汪”。
    void makeSound() {
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal{
    private String color;
    // 重写构造方法，用于初始化name、age和color属性。
    public Cat(String name, int age, String color) {
        //其中super关键字用于调用父类的构造方法，初始化从父类继承的属性name和age。
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // 实现makeSound()方法，使其打印出 “喵喵喵”。
    void makeSound() {
        System.out.println("喵喵喵");
    }
}



public class Animal_text {
    public static void main(String[] args) {
        Dog dog = new Dog("笨笨", 3, "田园犬");
        System.out.println("狗的名字: " + dog.getName());
        System.out.println("狗的年龄: " + dog.getAge());
        System.out.println("狗的品种: " + dog.getBreed());
        dog.makeSound();

        Cat cat = new Cat("糖豆", 1, "白色");
        System.out.println("猫的名字: " + cat.getName());
        System.out.println("猫的年龄: " + cat.getAge());
        System.out.println("猫的颜色: " + cat.getColor());
        cat.makeSound();
    }
}
