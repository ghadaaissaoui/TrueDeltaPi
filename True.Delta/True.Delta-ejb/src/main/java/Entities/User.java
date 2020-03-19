package Entities;
import java.io.Serializable;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import Enumerations.*;


@Entity
@Table(name="USER")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;
	
	@Column(name = "USER_NOM")
	private String nom;
	
	@Column(name = "USER_PRENOM")
	private String prenom;
	
	@Column(name = "USER_ADRESS_MAIL")
	private String adresseMail;
	
	@Column(name = "USER_PASSWORD")
	private String password;
	
	@Column(name = "USER_LOGIN")
	private String login;
	
<<<<<<< HEAD
	@Column(name = "Age")
	private int age;
	
	@Column(name = "Residency_Status")
	private String Residence;
	
	@Column(name = "Professional_Status")
	private String Profession;
	
	@Column(name = "Type_of_contract")
	private String typeofcontract;
	
	@Column(name = "Resources")
	private String Resource;
	
	@Column(name = "Refund_in_progress")
	private int Refund;
	
	@Column(name = "Credit_Balance")
	private int Credit;
	
	@Column(name = "Risk")
	private int Risk;
	
	@Column(name = "Diversified")
	private boolean Diversity;
=======
>>>>>>> branch 'master' of https://github.com/AchirAdelMounir/TrueDeltaPi.git
	
	
	@Embedded
	private Customer customer;
	
	@Embedded
	private AssetManager asset_manager;
	@Column(name = "USER_TYPE")
	private UserType Type;
	
	
	
	
	
	@OneToMany(mappedBy="User")
	private Set<Feedback> Feedbacks;
	@OneToMany(mappedBy="User")
	private Set<Complain> Complains;
	@OneToMany(mappedBy="User")
	private Set<Complain> Articles;
	@OneToMany(mappedBy="User")
	private Set<Contract> Contratcs;
	@OneToOne 
	private Portfolio portfolio;

	
	
	


	public AssetManager getAsset_manager() {
		return asset_manager;
	}

	public void setAsset_manager(AssetManager asset_manager) {
		this.asset_manager = asset_manager;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public UserType getType() {
		return Type;
	}

	public void setType(UserType type) {
		Type = type;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

	

}
