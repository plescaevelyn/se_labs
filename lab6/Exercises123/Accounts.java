package lab6.Exercises123;

public class Accounts implements Comparable<Accounts> {
    public Accounts(String name, double initialDeposit) {
        super();
    }

    @Override
    public int compareTo(Accounts o) {
        Accounts acc = (Accounts) o;
        return this.getOwner().compareTo(acc.getOwner());
    }

	private Accounts getOwner() {
		// TODO Auto-generated method stub
		return null;
	}
}
