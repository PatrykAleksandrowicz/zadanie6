package devices.company;

public class main {
    public static void  main(String[] args){
        Human me = new Human("Patryk","Aleksandrowicz",21,"men", 99999.0);
        Car auto = new Car("A3","Audi","120k", 100000.0);
        Car auto2 = new Car("A6","Audi","190k",500000.0);
        me.setCar(auto);

        boolean czytakiesoma = auto.hashCode() == auto2.hashCode();

        if(czytakiesoma == false){
            System.out.println("inne");
        }else {
            System.out.println("takie same");
        }

    }
}