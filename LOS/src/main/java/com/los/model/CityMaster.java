package com.los.model;
import javax.persistence.*;



@Entity

@Table(name="City_Master")
public class CityMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(unique = true)
	private String cityCode;
	private String cityName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn

	private StateMaster stateMaster;
	
	
	
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public StateMaster getStateMaster() {
		return stateMaster;
	}
	public void setStateMaster(StateMaster stateMaster) {
		this.stateMaster = stateMaster;
	}
	public CityMaster(long id, String cityCode, String cityName, StateMaster stateMaster) {
		super();
		this.id = id;
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.stateMaster = stateMaster;
	}
	public CityMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CityMaster [id=" + id + ", cityCode=" + cityCode + ", cityName=" + cityName + ", stateMaster="
				+ stateMaster + "]";
	}
	
	
	
	
}
