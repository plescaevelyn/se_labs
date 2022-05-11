package lab6;

public class accounts implements Comparable<accounts> {
    public accounts(String name, double initialDeposit) {
        super();
    }

    @Override
    public int compareTo(accounts o) {
        accounts acc = (accounts) o;
        return this.getOwner().compareTo(acc.getOwner());
    }

	private accounts getOwner() {
		// TODO Auto-generated method stub
		return null;
	}
}
