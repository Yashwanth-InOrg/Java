package Day2;



    class Vehicle {
        // final attribute
        final int maxSpeed;

        // Constructor to initialize the final attribute
        Vehicle(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        // Method to display the maxSpeed
        void displayMaxSpeed() {
            System.out.println("Maximum Speed: " + maxSpeed);
        }
    }

public class FinalAttributeExample {
        public static void main(String[] args) {
            // Creating an instance of Vehicle with a maxSpeed of 120
            Vehicle car = new Vehicle(120);

            // Displaying the maxSpeed
            car.displayMaxSpeed();

            // Attempting to change the final attribute will result in a compile-time error
            // car.maxSpeed = 150; // Uncommenting this line will cause an error

            // Creating another instance of Vehicle with a different maxSpeed
            Vehicle bike = new Vehicle(80);

            // Displaying the maxSpeed
            bike.displayMaxSpeed();
        }
    }

