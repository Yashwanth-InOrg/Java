package Day2;

public class DeepShallowCopy {
    static class Person {
        String name;
        Address address;

        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        void display() {
            System.out.println("Name: " + name + ", Address: " + address.street);
        }
    }

    static class Address {
        String street;

        Address(String street) {
            this.street = street;
        }
    }

    // Method to modify the object (shallow copy)
    static void modifyPersonShallow(Person person) {
        person.name = "Modified Name";
        person.address.street = "Modified Street";
    }

    // Method to modify the object (deep copy)
    static void modifyPersonDeep(Person person) {
        person.name = "Modified Name";
        person.address = new Address("Modified Street");
    }

    public static void main(String[] args) {
        Address address = new Address("Original Street");
        Person person = new Person("Original Name", address);

        // Display original object
        System.out.println("Original Object:");
        person.display();

        // Shallow copy modification
        modifyPersonShallow(person);
        System.out.println("\nAfter Shallow Copy Modification:");
        person.display();

        // Resetting the object
        person.name = "Original Name";
        person.address = new Address("Original Street");

        // Display reset object
        System.out.println("\nReset Object:");
        person.display();

        // Deep copy modification
        modifyPersonDeep(person);
        System.out.println("\nAfter Deep Copy Modification:");
        person.display();
    }
}
