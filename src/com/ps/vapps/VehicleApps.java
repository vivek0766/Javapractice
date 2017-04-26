package com.ps.vapps;

import com.ps.transportation.Bike;
import com.ps.transportation.Bus;
import com.ps.transportation.Car;
import com.ps.transportation.Seating;
import com.ps.transportation.Vehicles;

public class VehicleApps {

	public static void main(String[] args) {

Vehicles avehicles=new Vehicles();

Vehicles bvehicles=new Car();

Vehicles cvehicles=new Bike();

Vehicles dvehicles=new Bus();

avehicles.invented();

bvehicles.invented();

cvehicles.invented();

dvehicles.invented();

Seating aseating=new Car();

Seating bseating=new Bike();

Seating cseating=new Bus();

aseating.accomodate();

bseating.accomodate();

cseating.accomodate();


		// TODO Auto-generated method stub

	}

}
