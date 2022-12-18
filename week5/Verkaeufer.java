package myPackage;

import java.util.ArrayList;

public class Verkaeufer extends Mitarbeiter {
	private boolean arbeitsKleidung;

	public boolean schuhVerkaufen(ArrayList<Schuh> schuhe, Schuh schuh) {
		if (schuhe.contains(schuh)) {
			schuhe.remove(schuh);
			return true;
		} else {
			return false;
		}
	}

	public boolean isArbeitsKleidung() {
		return arbeitsKleidung;
	}

	public void setArbeitsKleidung(boolean arbeitsKleidung) {
		this.arbeitsKleidung = arbeitsKleidung;
	}

	@Override
	public String arbeiten(String s) {
		if (s == "Koennen Sie mir weiterhelfen?") {
			return "Ja gerne doch";
		} else {
			return "Tut mir Leid ich habe Ihre Frage nicht verstanden";
		}
	}
}
