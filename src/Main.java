public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","Granta","жёлтый","Россия",1.7f,2015);
        Car car2 = new Car("Audi","A8 50 L TDI quattro","чёрный","Германия",3.0f,2020);
        Car car3 = new Car("BMW","Z8","чёрный","Германия",3.0f,2021);
        Car car4 = new Car("Kia","Sportage 4","красный","Южная Корея",2.4f,2018);
        Car car5 = new Car("Hyundai","Avante","оранжевый","Южная Корея",1.6f,2016);
        Car car6 = new Car("","","","",0,0);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
    }
}