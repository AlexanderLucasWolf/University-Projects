package myPackage;

import java.util.LinkedList;

public class Chef extends Mitarbeiter {
	public boolean mitarbeiterEntlassen(LinkedList<Mitarbeiter> angestellte, Mitarbeiter mitarbeiter) {
		if (angestellte.contains(mitarbeiter)) {
			angestellte.remove(mitarbeiter);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String arbeiten(String s) {
		if (s == "Koennen Sie mir weiterhelfen?") {
			return "Ein Mitarbeiter wird gleich bei Ihnen sein";
		} else {
			return "Tut mir Leid ich habe Ihre Frage nicht verstanden";
		}
	}
}
