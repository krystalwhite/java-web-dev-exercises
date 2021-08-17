package exercises.technology;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54);
        Laptop laptop = new Laptop("Lenovo Thinkpad X1 Titanium Yoga", 16, 1769.40, 13.5, true, 2.54, true, true);
        SmartPhone smartPhone = new SmartPhone("Moto G Play", 3, 169.99, 6.5, false, 1, true);


        System.out.println("Computer ID: " + computer.createID());
        System.out.println("Laptop ID: " + laptop.createID());
        System.out.println("SmartPhone ID: " + smartPhone.createID());

//        System.out.println("Computer ID: " + computer.getIdCounter());
//        System.out.println("Laptop ID: " + laptop.getIdCounter());
//        System.out.println("SmartPhone ID: " + smartPhone.getIdCounter());
    }
}
