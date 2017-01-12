package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity  @Table(name="species")
public class Specie {
	@Id @GeneratedValue
	private Long id;
	
	@Column(length =50)
	private int rcbiTaxaId;
	
	@Column(length =50)
	private String commonName;
	
	@Column(length =50)
	private String eneageString;
	
	@Column(length =50)
	private String openus;
	
	
	@Column(length =50)
	private String species;
	
	@Column(length =50)
	private int parentId;
	
	@Column(length =50)
	private String leghvalue;
	
	@Column(length =50)
	private String rightvalue;
	
	
	@Column(length =50)
	private String taxonomicRank;



	public Specie(int rcbiTaxaId, String commonName, String eneageString,
			String openus, String species, int parentId, String leghvalue,
			String rightvalue, String taxonomicRank) {
		super();
		this.rcbiTaxaId = rcbiTaxaId;
		this.commonName = commonName;
		this.eneageString = eneageString;
		this.openus = openus;
		this.species = species;
		this.parentId = parentId;
		this.leghvalue = leghvalue;
		this.rightvalue = rightvalue;
		this.taxonomicRank = taxonomicRank;
	}

	public Specie(){
		this(0,"","","","",0,"","","");
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getRcbiTaxaId() {
		return rcbiTaxaId;
	}


	public void setRcbiTaxaId(int rcbiTaxaId) {
		this.rcbiTaxaId = rcbiTaxaId;
	}


	public String getCommonName() {
		return commonName;
	}


	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}


	public String getEneageString() {
		return eneageString;
	}


	public void setEneageString(String eneageString) {
		this.eneageString = eneageString;
	}


	public String getOpenus() {
		return openus;
	}


	public void setOpenus(String openus) {
		this.openus = openus;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public int getParentId() {
		return parentId;
	}


	public void setParentId(int parentId) {
		this.parentId = parentId;
	}


	public String getLeghvalue() {
		return leghvalue;
	}


	public void setLeghvalue(String leghvalue) {
		this.leghvalue = leghvalue;
	}


	public String getRightvalue() {
		return rightvalue;
	}


	public void setRightvalue(String rightvalue) {
		this.rightvalue = rightvalue;
	}

	public String getTaxonomicRank() {
		return taxonomicRank;
	}

	public void setTaxonomicRank(String taxonomicRank) {
		this.taxonomicRank = taxonomicRank;
	}

	@Override
	public String toString() {
		return "Specie [id=" + id + ", rcbiTaxaId=" + rcbiTaxaId
				+ ", commonName=" + commonName + ", eneageString="
				+ eneageString + ", openus=" + openus + ", species=" + species
				+ ", parentId=" + parentId + ", leghvalue=" + leghvalue
				+ ", rightvalue=" + rightvalue + ", taxonomicRank="
				+ taxonomicRank + "]";
	}


	
	
	
	

}
