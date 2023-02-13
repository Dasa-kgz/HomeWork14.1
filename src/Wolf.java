public class Wolf extends Animal{
    public Wolf(String name, int age) {
        super(name, age);
    }
    String color;
    String sex;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void sleep(){
        System.out.println(this.name+" Sleeping....");
    }
    public void Hunt(){
        System.out.println(this.name+" Hunting");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
