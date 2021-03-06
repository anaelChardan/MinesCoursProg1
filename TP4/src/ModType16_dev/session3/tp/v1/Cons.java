package ModType16_dev.session3.tp.v1;

class Cons<T> implements MultiEnsembleComposite<T> {

    private T element;
    private MultiEnsemble reste;
    private int taille;

    public Cons( T i, MultiEnsemble ens ) {
        this.element = i;
        this.reste = ens;
        this.taille = 1 + ens.taille();
    }

    @Override
    public int taille() {
        return this.taille;
    }

    @Override
    public boolean estVide() {
        return false;
    }

    @Override
    public boolean estCons() {
        return true;
    }

    @Override
    public boolean estUnion() {
        return false;
    }

    @Override
    public T element() {
        return this.element;
    }

    @Override
    public MultiEnsemble reste() {
        return this.reste;
    }

    @Override
    public MultiEnsemble gauche() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MultiEnsemble droit() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return this.representer();
    }
}
