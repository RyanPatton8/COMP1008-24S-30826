package assignment3;

public class Vehicle {
    public String color = "White";
    // you may wonder what car has the most doors.
    // don't worry I took the liberty of looking it up, the Toyota Tundrasine Limo Pickup with 8 total doors
    // what a world.
    protected byte numberOfDoors = 4;
    private boolean gasPowered = true;


    public boolean isGasPowered() {
        return gasPowered;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    public boolean isEcoFriendly() {
        return !gasPowered && numberOfDoors == 2;
    }

    public Vehicle() {}

    public Vehicle(String color, byte numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle(byte numberOfDoors, boolean gasPowered, String color) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle(boolean gasPowered, String color, byte numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle(boolean gasPowered, byte numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

//    4) Override (not Overload) the equals() method so it evaluates two Vehicle objects and returns true
//            if and only if (iff) the two Vehicle objects are equal is value (2 marks)
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vehicle compare)) {
            return false;
        } else {
            return this.color.equals(compare.color) && this.numberOfDoors == compare.numberOfDoors && this.gasPowered == compare.gasPowered;
        }
    }

//    5) Override the toString method to summarize all instance variables of the class (1 mark)
}
