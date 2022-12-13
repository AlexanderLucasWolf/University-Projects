package myPackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class Schuhladen {
	private LinkedList<Mitarbeiter> angestellte;
	private ArrayList<Schuh> schuhe;
	private Chef chef;

	public LinkedList<Mitarbeiter> getAngestellte() {
		return angestellte;
	}

	public void setAngestellte(LinkedList<Mitarbeiter> angestellte) {
		this.angestellte = angestellte;
	}

	public ArrayList<Schuh> getSchuhe() {
		return schuhe;
	}

	public void setSchuhe(ArrayList<Schuh> schuhe) {
		this.schuhe = schuhe;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
}
