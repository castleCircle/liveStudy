package test;

public class Monkey extends Animal{

    String name;
    int weight;

    public Monkey(String name,int weight){
        this.name = name;
        this.weight = weight;
    }

    public Monkey(String name,int weight,String country){
        super(country);
        this.name = name;
        this.weight = weight;
    }

    public void print(){
        System.out.println("이름은 : " + name + ", 무게는 : " + weight);
    }

    public static void main(String[] args) {
        Monkey monkey = new Monkey("원숭이",20);
        monkey.print();

    }
}
