public class Animal {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(this.name+" Есть мясо");
    }
}
