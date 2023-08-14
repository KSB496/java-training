package optionalapp;

import java.util.Optional;

public class MobileService {

	public int getMobileScreenWidth(Optional<Mobile> mobile) {
		
		return mobile.flatMap(Mobile :: getDisplayFeature)
				.flatMap(DisplayFeature :: getResolution)
				.map(ScreenResolution :: getWidth)
				.orElse(0);
	}
	
	public int getCameraMegaPixel(Optional<Mobile> mobile) {
		
		return mobile.flatMap(Mobile :: getDisplayFeature)
				.flatMap(DisplayFeature :: getResolution)
				.map(ScreenResolution :: getMegaPixels)
				.orElse(0);
	}
}
