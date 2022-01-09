package test;

import java.util.ArrayList; 
import animals.Animal;

public class House {
	ArrayList<Animal> animalList;
	
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void print() {
		System.out.println("Följande djur finns i huset:");

		for (Animal animal : animalList) {
			animal.print();
		}
	}
}
