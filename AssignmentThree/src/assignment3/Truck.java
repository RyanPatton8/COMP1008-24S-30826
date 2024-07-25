package assignment3;

public class Truck extends Vehicle {
    public byte seats = 5;
    // I'm measuring in cubic feet some vehicles get up to 144 so byte wasn't an option
    // plus I already used it
    protected short trunkSpace = 80;

    public Truck() {}

    public Truck(String color, byte numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.setGasPowered(gasPowered);
    }

    public Truck(byte numberOfDoors, boolean gasPowered, String color) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.setGasPowered(gasPowered);
    }

    public Truck(boolean gasPowered, String color, byte numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.setGasPowered(gasPowered);
    }

    public Truck(boolean gasPowered, byte numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        this.setGasPowered(gasPowered);
    }

    public Truck(String color, byte numberOfDoors, boolean gasPowered, byte seats) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.setGasPowered(gasPowered);
        this.seats = seats;
    }

    public Truck(String color, byte numberOfDoors, boolean gasPowered, short trunkSpace) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.setGasPowered(gasPowered);
        this.trunkSpace = trunkSpace;
    }

    public Truck(String color, byte numberOfDoors, boolean gasPowered, byte seats, short trunkSpace) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.setGasPowered(gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Truck compare)) {
            return false;
        } else {
            return this.color.equals(compare.color) &&
                    this.numberOfDoors == compare.numberOfDoors &&
                    this.isGasPowered() == compare.isGasPowered() &&
                    this.seats == compare.seats &&
                    this.trunkSpace == compare.trunkSpace;
        }
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nNumber of Doors: " + numberOfDoors
                + "\nGas Powered: " + isGasPowered() + "\nNumber of Seats: " + seats
                + "\nTrunk Space in ft^3: " + trunkSpace;
    }

    @Override
    public boolean isEcoFriendly() {
        return !isGasPowered() && numberOfDoors == 2 && trunkSpace == 0;
    }
}
