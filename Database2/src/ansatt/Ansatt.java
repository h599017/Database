package ansatt;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Ansatt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ansattid;
	
	@Column
	private String brknavn;
	@Column
	private String fornavn;
	@Column
	private String etternavn;
	@Column
	private LocalDate ansettelsesdato;
	@Column
	private String stilling;
	@Column
	private int mndloenn;
	
	@Column(name="avdelingid")
	private String avdeling;
	
	@Column(name="prosjektid")
	private int[] prosjekter;
	
	public Ansatt() {
		
	}
	
	public Ansatt(String brk, String fornvn, String etter) {
		this.brknavn = brk;
		fornavn = fornvn;
		etternavn = etter;
		this.ansettelsesdato = LocalDate.now();
		this.stilling = null;
		this.mndloenn = 0;
		prosjekter = new int[100];
	}
	
	public int getID() {
		return ansattid;
	}
	
	public String getbrk() {
		return brknavn;
	}
	
	public String getFornavn() {
		return fornavn;
	}
	
	public String getEtternavn() {
		return etternavn;
	}
	
	public String getNavn() {
		return fornavn + " " + etternavn;
	}
	
	public void setFornavn(String nynavn) {
		fornavn = nynavn;
	}
	
	public void setEtternavn(String nynavn) {
		etternavn = nynavn;
	}
	
	public LocalDate getDato() {
		return ansettelsesdato;
	}
	
	public void setDato(LocalDate dato2) {
		ansettelsesdato = dato2;
	}
	
	public String getStilling() {
		return stilling;
	}
	
	public void setStilling(String stilling) {
		this.stilling = stilling;
	}
	
	public int getLoenn() {
		return mndloenn;
	}
	
	public void setLoenn(int loenn) {
		mndloenn = loenn;
	}
	
	public String getAvdeling() {
		return avdeling;
	}
	
	public void setAvdeling(String avd) {
		avdeling = avd;
	}
	
	public int[] getProsjekter(){
		return prosjekter;
	}
	
	public void skrivUt() {
		String ut = "";
		ut += ansattid + "/n" + brknavn + "/n" + getNavn() + "/n"
		+ ansettelsesdato + "/n" + stilling + "/n" + mndloenn + "/n" + avdeling;
		System.out.println(ut);
	}
}
