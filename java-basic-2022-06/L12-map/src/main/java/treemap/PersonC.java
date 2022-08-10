package treemap;

public class PersonC implements Comparable<PersonC> {
    private Integer id;
    private String name;

    public PersonC(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonС{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(PersonC o) {
        return this.name.compareTo(o.getName());
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
