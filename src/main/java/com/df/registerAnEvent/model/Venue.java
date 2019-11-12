package com.df.registerAnEvent.model;

public class Venue 
{
	private String BuildingName;
	private String Street;
	private String Locality;
	private String LandMark;
	private String City;
	private String State;
	private String Pincode;
	 public Venue() {}
	 
	public Venue(String buildingName, String street, String locality, String landMark, String city, String state,
			String pincode) {
		super();
		BuildingName = buildingName;
		Street = street;
		Locality = locality;
		LandMark = landMark;
		City = city;
		State = state;
		Pincode = pincode;
	}


	public String getBuildingName() {
		return BuildingName;
	}


	public void setBuildingName(String buildingName) {
		BuildingName = buildingName;
	}


	public String getStreet() {
		return Street;
	}


	public void setStreet(String street) {
		Street = street;
	}


	public String getLocality() {
		return Locality;
	}


	public void setLocality(String locality) {
		Locality = locality;
	}


	public String getLandMark() {
		return LandMark;
	}


	public void setLandMark(String landMark) {
		LandMark = landMark;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getPincode() {
		return Pincode;
	}


	public void setPincode(String pincode) {
		Pincode = pincode;
	}

	@Override
	public String toString() {
		return "Venue [BuildingName=" + BuildingName + ", Street=" + Street + ", Locality=" + Locality + ", LandMark="
				+ LandMark + ", City=" + City + ", State=" + State + ", Pincode=" + Pincode + "]";
	}
	
	

}
