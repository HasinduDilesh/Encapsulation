public class Person {
    private int age;
    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }
}
class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(25);
        System.out.println(p.getAge());
    }
}
