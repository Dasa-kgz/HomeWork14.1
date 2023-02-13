public class Main {
    public static void main(String[] args) {

        Wolf wolf = new Wolf("Акбара",5);
        wolf.setColor("Ак");
        wolf.setSex("Female");
        System.out.println(wolf);
        Animal animal = new Animal(wolf.name, wolf.age);
        animal.eat();
        wolf.Hunt();
        wolf.sleep();

    }


}