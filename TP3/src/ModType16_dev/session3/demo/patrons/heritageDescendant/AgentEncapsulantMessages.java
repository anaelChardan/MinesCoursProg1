package ModType16_dev.session3.demo.patrons.heritageDescendant;

import ModType16_dev.session3.demo.patrons.agregationDelegation.AgentCommuniquant;

public abstract class AgentEncapsulantMessages implements AgentCommuniquant{
	@Override
	public void envoyer(String msg) {
		this.emettre(msg);
	}
}
