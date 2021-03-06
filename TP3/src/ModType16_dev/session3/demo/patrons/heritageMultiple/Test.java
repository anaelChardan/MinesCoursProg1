package ModType16_dev.session3.demo.patrons.heritageMultiple;

import ModType16_dev.session3.demo.patrons.agregationDelegation.Agent;
import ModType16_dev.session3.demo.patrons.agregationDelegation.AgentCommuniquant;

public class Test {
	public static void main(String[] args) {
		AgentCommuniquant a = new AgentDecoupantMessagesPourProtocole1();
		a.envoyer("nul n'est censé ignorer la loi.");
		
		Agent b = new AgentDecoupantMessagesPourProtocole2();
		b.envoyer("nul n'est censé ignorer la loi.");
		
		a = new AgentEncapsulantMessagesPourProtocole1();
		a.envoyer("nul n'est censé ignorer la loi.");
		
		b = new AgentEncapsulantMessagesPourProtocole2();
		b.envoyer("nul n'est censé ignorer la loi.");
	}
}
