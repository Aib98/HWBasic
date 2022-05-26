import java.util.Objects;

class Person {
    private String name;
    private int berthYear;

    public Person(String name, int berthYear) {
        this.name = name;
        this.berthYear = berthYear;
    }

    public Person() {
        }


    @Override
    public String toString() {
        return
                "Клиент: " + name + '\'' +
                "год рождения: " + berthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return berthYear == person.berthYear && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, berthYear);
    }
}
