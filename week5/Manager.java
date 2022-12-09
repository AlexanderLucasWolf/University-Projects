package myPackage;

import java.util.ArrayList;

public class Manager extends Mitarbeiter {
	private boolean schluessel;

	public boolean schuhBestellen(ArrayList<Schuh> schuhe, Schuh schuh) {
		if (schuh != null && schuhe != null) {
			schuhe.add(schuh);
			return true;
		} else {
			return false;
		}
	}

	public boolean isSchluessel() {
		return schluessel;
	}

	public void setSchluessel(boolean schluessel) {
		this.schluessel = schluessel;
	}
}
