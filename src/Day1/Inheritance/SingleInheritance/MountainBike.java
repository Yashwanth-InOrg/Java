package Day1.Inheritance.SingleInheritance;

// derived class
class MountainBike extends Bicycle { // Inheritance - Extends

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed); // Constructor Telescoping
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

// Constructor Telescoping - Using the Parent constructor to
// Initialize the attributes derived from the parent Constructor

