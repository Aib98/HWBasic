import java.util.Objects;

class Client {
    public String name;
    public int birthYear;

    public Client(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return birthYear == client.birthYear && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}

