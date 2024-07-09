package Day2.CallByValue;

class Person{
    String name;
    String id;
    public Person(String name_input, String id_input){
        this.name = name_input;
        this.id = id_input;
    }
    public static Person modifyValue(Person p){
        p.name = "Shreya";
        return p;
    }
}