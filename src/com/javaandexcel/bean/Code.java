package com.javaandexcel.bean;

/**
 * @author wpf
 * 2016年11月18日 上午10:13:41
 */
public class Code {
	
	private String countyCode;
	private String countyName;
	private String cityCode;
	private String cityName;
	private String provinceCode;
	private String provinceName;
	
	public String getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
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
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public Code() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Code [countyCode=" + countyCode + ", countyName=" + countyName
				+ ", cityCode=" + cityCode + ", cityName=" + cityName + "]";
	}

}
