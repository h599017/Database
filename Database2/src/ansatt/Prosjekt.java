package ansatt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prosjekt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int prosjektid;
	
	@Column
	private String prosjektnavn;
	
	@Column
	private String beskrivelse;
	
	@Column
	private int[] deltakere;
}
