package ansatt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avdeling {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int avdelingid;
	
	@Column
	public String avdelingsnavn;
	
	@Column
	public int avdelingssjefid;
	
	public Avdeling() {
		
	}
	
	public Avdeling(String navn, int sjef) {
		this.avdelingsnavn = navn;
		this.avdelingssjefid = sjef;
	}
}
