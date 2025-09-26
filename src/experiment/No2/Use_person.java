package experiment.No2;

class Person{
    String name;
    int age;
    void introduce(){
        System.out.println("我叫"+name+",今年"+age+"岁");
    }
    Person(){
        System.out.println("无参构造函数");
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("有参构造函数");
    }

}

public class Use_person {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="张三";
        p1.age=20;
        p1.introduce();

        Person p2=new Person("李四",25);
        p2.introduce();
    }
}
