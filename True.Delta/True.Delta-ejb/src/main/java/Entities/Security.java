package Entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="SECURITIES")

public class Security implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int Id;
	@Column(name="TYPE")
	private String Type;
	@Embedded
	private Stock S;
	@Embedded
	private Bond B;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COMPANY_SYMBOL",referencedColumnName="SYMBOL")
	private Company Company;
	@ManyToOne
	private Portfolio Portfolio;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Stock getS() {
		return S;
	}
	public void setS(Stock s) {
		S = s;
	}
	public Bond getB() {
		return B;
	}
	public void setB(Bond b) {
		B = b;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Company getCompany() {
		return Company;
	}
	public void setCompany(Company company) {
		Company = company;
	}
	public Portfolio getPortfolio() {
		return Portfolio;
	}
	public void setPortfolio(Portfolio portfolio) {
		Portfolio = portfolio;
	}

}
