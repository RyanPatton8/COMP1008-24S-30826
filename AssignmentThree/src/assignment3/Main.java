package assignment3;

public class Main {
    public static void main(String[] args) {
        //Vehicle Testing
//        Vehicle vehicle = new Vehicle();
//        Vehicle vehicle2 = new Vehicle();
//        Vehicle vehicle3 = new Vehicle("Black", (byte) 2, false);
//        System.out.println("Vehicle 1 Instance Variables");
//        System.out.println(vehicle);
//        System.out.println("Does Vehicle 2 equal vehicle 1");
//        System.out.println(vehicle.equals(vehicle2));
//        System.out.println("Does Vehicle 3 equal vehicle 1");
//        System.out.println(vehicle.equals(vehicle3));
//        System.out.println("Is Vehicle 1 eco Friendly");
//        System.out.println(vehicle.isEcoFriendly());
//        System.out.println("Is Vehicle 3 eco Friendly");
//        System.out.println(vehicle3.isEcoFriendly());

        //Truck Testing
//        Truck truck = new Truck();
//        Truck truck2 = new Truck();
//        Truck truck3 = new Truck("Black", (byte) 2, false, (byte) 2, (short) 128);
//        Truck truck4 = new Truck("Black", (byte) 2, false, (byte) 2, (short) 0);
//        Truck truck5 = new Truck("Black", (byte) 2, false);
//
//        System.out.println("--------------------------------------");
//        System.out.println("Truck 1 Instance Variables");
//        System.out.println(truck);
//        System.out.println("--------------------------------------");
//        System.out.println("Truck 4 instance Variables");
//        System.out.println(truck4);
//        System.out.println("--------------------------------------");
//        System.out.println("Truck 2 equals truck 1");
//        System.out.println(truck.equals(truck2));
//        System.out.println("--------------------------------------");
//        System.out.println("Truck 3 equals truck 1");
//        System.out.println(truck.equals(truck3));
//        System.out.println("--------------------------------------");
//        System.out.println("is Truck 5 eco friendly");
//        System.out.println(truck5.isEcoFriendly());
//        System.out.println("--------------------------------------");
//        System.out.println("is truck 4 eco friendly");
//        System.out.println(truck4.isEcoFriendly());

        Computer comp = new Computer();
        comp.tapButton(comp.getKeyBind(0));
        comp.tapButton(comp.getKeyBind(1));
        comp.holdButton(2, comp.getKeyBind(2));
        comp.tapButton(comp.getKeyBind(3));
        comp.tapButton(comp.getKeyBind(7));
        comp.tapButton(comp.getKeyBind(4));
        comp.tapButton(comp.getKeyBind(3));
        comp.tapButton(comp.getKeyBind(5));
        comp.tapButton(comp.getKeyBind(2));
        comp.tapButton(comp.getKeyBind(6));

        //right my full name with change key bind
    }
}