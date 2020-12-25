package test;

abstract class Animal {

    String name;
    int weight;
    String country;

    public Animal(){
        this.name = "이름";
        this.weight = 0;
    }

    public Animal(String country){
        this.name = "이름";
        this.weight = 0;
        this.country = country;
    }

    abstract void print();
}
