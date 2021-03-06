package session.demo1.v2;

public class FabriqueNatParInt implements FabriqueNat {
    @Override
    public Nat creerNatAvecValeur(int x) {
        return new NatParInt(x);
    }

    @Override
    public Nat creerNatAvecRepresentation(String repDecimale) {
        return new NatParInt(Integer.parseInt(repDecimale));
    }
}
