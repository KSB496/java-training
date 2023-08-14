package optionalapp;

import java.util.Optional;

import optionaldemo.Employee;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScreenResolution resolution = new ScreenResolution(750,1334,550);
		DisplayFeature displayFeature = new DisplayFeature("4.8",Optional.of(resolution));
		Mobile mobile = new Mobile(45678, "Apple", "Iphone", Optional.of(displayFeature));
		
		MobileService mobileService = new MobileService();
		
		int mWidth = mobileService.getMobileScreenWidth(Optional.of(mobile));
		int cPixel = mobileService.getCameraMegaPixel(Optional.of(mobile));
		System.out.println("Mobile Width : " + mWidth);
		System.out.println("Mobile Camera Details : "+cPixel);
		
	
		
	}


}
