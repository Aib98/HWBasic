import java.util.Arrays;
import java.util.Objects;

class Account extends Person {
    private int[] bill;

    public Account(String name, int berthYear, int[] bill) {
        super(name, berthYear);
        this.bill = bill;
    }

    @Override
    public String toString() {
        return
                "Счета: " + Arrays.toString(bill) +
                '\n';
    }

    public int[] getBill() {
        return bill;
    }

    public void setBill(int[] bill) {
        this.bill = bill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Account account = (Account) o;
        return Arrays.equals(bill, account.bill);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(bill);
        return result;
    }
}

