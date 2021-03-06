package ModType16_dev.session2.demo.heritageMultiple;

import ModType16_dev.session1.tp.Nat;

public abstract class Zero implements Nat {

	@Override
	public int val() {
		return 0;
	}

	@Override
	public boolean estNul() {
		return true;
	}

	@Override
	public Nat predecesseur() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "0";
	}
}
