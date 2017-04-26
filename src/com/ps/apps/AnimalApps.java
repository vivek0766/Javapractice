package com.ps.apps;

import com.ps.beings.Animals;
import com.ps.beings.Cat;
import com.ps.beings.Cow;
import com.ps.beings.Dog;
import com.ps.beings.Pet;

public class AnimalApps {

	public static void main(String[] args) {
		
		Animals aAnimal=new Animals();
		Animals bAnimal=new Cat();
		Animals cAnimal=new Dog();
		Animals dAnimal=new Cow();
		
		aAnimal.says();
		bAnimal.says();
		cAnimal.says();
		dAnimal.says();
		
		Pet aPet=new Cat();
		Pet bPet=new Dog();
		Pet cPet=new Cow();
		
		aPet.pettable();
		bPet.pettable();
		cPet.pettable();
		
	}

}
