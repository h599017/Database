package database;

import ansatt.Ansatt;
import java.util.ArrayList;

public class Database {

	private static int sisteindeks;
	private static ArrayList<Ansatt> base = new ArrayList<Ansatt>();;

	public static void leggTilAnsatt(Ansatt ny) {
		base.add(ny);
		sisteindeks++;
	}

	public static void fjernAnsatt(int id) {
		for (int i = 0; i < sisteindeks; i++) {
			if (base.get(i).getID() == id) {
				base.remove(i);
				sisteindeks--;
			}
		}
	}

	public static Ansatt letID(int id) {
		for (int i = 0; i < sisteindeks; i++) {
			if (base.get(i).getID() == id) {
				return base.get(i);
			}
		}
		return null;
	}
	
	public static Ansatt letBrk(String soek) {
		for (int i = 0; i < sisteindeks; i++) {
			if (base.get(i).getbrk() == soek) {
				return base.get(i);
			}
		}
		return null;
	}
	
	public static void stillingsEndring(int id, String nyStilling) {
		for (int i = 0; i < sisteindeks; i++) {
			if (base.get(i).getID() == id) {
				base.get(i).setStilling(nyStilling);
			}
		}
	}
	
	public static void loennsEndring(int id, int nyLoenn) {
		for (int i = 0; i < sisteindeks; i++) {
			if (base.get(i).getID() == id) {
				base.get(i).setLoenn(nyLoenn);
			}
		}
	}

	public static String getAnsatte() {
		String retur = "";
		for (int i = 0; i < sisteindeks; i++) {
			retur += base.get(i) + "/n";
		}
		return retur;
	}
}
