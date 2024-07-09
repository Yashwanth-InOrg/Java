package Day2;

    class Animal {
        String name = "Animal";

        void display() {
            System.out.println("Animal Name: " + name);
        }
    }

    class Dog extends Animal {
        String name = "Dog";

        void display() {
            System.out.println("Dog Name: " + this.name);
            System.out.println("Animal Name: " + super.name);
        }

        void printNames() {
            // Using this to refer to the current class's attribute
            System.out.println("Dog's name: " + this.name);

            // Using super to refer to the superclass's attribute
            System.out.println("Animal's name: " + super.name);
        }
    }

    public class ThisSuperExample {
        public static void main(String[] args) {
            Dog dog = new Dog();

            // Calling display method to see the effect of this and super
            dog.display();

            // Calling printNames method to see the effect of this and super
            dog.printNames();
        }
    }

