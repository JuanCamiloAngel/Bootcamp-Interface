package ex1;

public class Persona implements IPrecedable<Persona> {

    private String name;
    private String lastName;
    private long id;

    public Persona(String name, String lastName, long id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int precedeA(Persona persona) {
        return this.name.compareTo(persona.getName());
    }

    @Override
    public String toString() {
        return "ex1.Persona{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
