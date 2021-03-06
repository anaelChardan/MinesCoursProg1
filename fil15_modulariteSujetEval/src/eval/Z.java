package eval;

/*
 * Question 3.1 : interface à compléter
 */

import structuresAlgebriques.AnneauUnitaire;

public interface Z extends Representation<Couple<Nat, Nat>>, FabriqueRelatifs<Z, Nat>, AnneauUnitaire<Z> {
	boolean equals(Object o); // Renvoie false
								// si o n'est pas de type Z,
								// teste l'égalité des entiers relatifs sinon

	String toString(); // Représente l'entier relatif
						// sous la forme d'une différence
}
