package com.ps.transportation;

public class Bus extends Vehicles implements Seating
{

public void invented()
{

System.out.println("i am a Blaise Pascal idea(Paris1662) and motorized by sir Goldsworthy Gurney(Britian1830)");

}
@Override
public void accomodate()
{
System.out.println("i can have more passengers");
}

}