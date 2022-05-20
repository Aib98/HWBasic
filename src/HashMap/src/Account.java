import java.util.Objects;

class Account {
    public int bill;

    public Account(int bill){
        this.bill=bill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return bill == account.bill;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bill);
    }
}
