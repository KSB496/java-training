package optionalapp;

import java.util.Optional;

public class Mobile {

	private long id;
	private String brand;
	private String name;
	private Optional<DisplayFeature> displayFeature;
	public Mobile(long id, String brand, String name, Optional<DisplayFeature> displayFeature) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.displayFeature = displayFeature;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<DisplayFeature> getDisplayFeature() {
		return displayFeature;
	}
	public void setDisplayFeature(Optional<DisplayFeature> displayFeature) {
		this.displayFeature = displayFeature;
	}
	
}
