package ModType16_dev.session2.tp.descendant;

import ModType16_dev.session2.tp.AgentCommuniquant;

public class AgentEncapsulantMessagesPourProtocole1 extends AgentEncapsulantMessages implements AgentCommuniquant {
	@Override
	public void emettre(String msg) {
		System.out.println("protocole 1 : " + msg);
	}
}
