package Day2.CallByValue;

class HelloWorld {
    public static void main(String[] args) {
        Person p = new Person("XYZ", "1");
        Person modifiedPerson = Person.modifyValue(p); // Shallow Copy
        System.out.println(p.name);
        System.out.println(modifiedPerson.name);
    }
}