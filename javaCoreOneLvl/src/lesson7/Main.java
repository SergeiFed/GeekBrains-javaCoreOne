package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        for(int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + (i+1));
        }
        Plate plate1 = new Plate(80);
        for(int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
        }
    }
}