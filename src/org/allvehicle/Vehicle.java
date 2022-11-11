package org.allvehicle;
import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;
import org.fourwheeler.FourWheeler;
public class Vehicle {

	private void vehicleNecessery() {
		System.out.println("Vehicle = DIO");

	}
	public static void main(String[] args) {
		Vehicle a = new Vehicle();
		a.vehicleNecessery();
		TwoWheeler b = new TwoWheeler();
		b.bike();
		b.cycle();
		ThreeWheeler c = new ThreeWheeler();
		c.auto();
		FourWheeler d = new FourWheeler();
		d.car();
		d.bus();
		d.lorry();
		d.van();
		
		
		
		
	}
	
	
}
