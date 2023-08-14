package optionalapp;

import java.util.Optional;

public class DisplayFeature {
	
	private String size;
	private Optional<ScreenResolution> resolution;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Optional<ScreenResolution> getResolution() {
		return resolution;
	}
	public void setResolution(Optional<ScreenResolution> resolution) {
		this.resolution = resolution;
	}
	public DisplayFeature(String size, Optional<ScreenResolution> resolution) {
		super();
		this.size = size;
		this.resolution = resolution;
	}
	
	
}
