package ModType16_dev.session2.tp.ascendant;

import ModType16_dev.session2.tp.AgentCommuniquant;

public class AgentDecoupantMessagesPourProtocole2  extends CanalOutProtocole2 implements AgentCommuniquant{

	@Override
	public void envoyer(String msg) {
		int TAILLE = 5;
		StringBuilder m = new StringBuilder(msg);
		int q = msg.length() / TAILLE;
		int r = msg.length() % TAILLE;
		for(int j = 0; j < q; j++){
			this.emettre(m.substring(j * TAILLE, (j+1) * TAILLE));
		}
		this.emettre(m.substring(q * TAILLE, q * TAILLE + r));
	}

}
