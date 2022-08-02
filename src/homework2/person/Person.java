package homework2.person;

abstract public class Person {

    protected String name;

    public Person() {
    }

    public abstract void greet(Person person);

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
