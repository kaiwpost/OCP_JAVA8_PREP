package org.sbpdiscovery.java.designPatterns;


import java.util.Arrays;
import java.util.List;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * This is to demonstrate the Builder design pattern.
 */
public class AnimalBuilder {

	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}
	
	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	
	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}
	
	public Animal build() {
		return new Animal(species, age, favoriteFoods);
	}
	
	public static void main(String[] args) {

		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder
			.setSpecies("duck")
			.setAge(4)
			.setFavoriteFoods(Arrays.asList("grass", "fish"));
		Animal duck = duckBuilder.build();
		System.out.println(duck);
		
		Animal flamingo =
			new AnimalBuilder()
				.setSpecies("falmingo")
				.setAge(2)
				.setFavoriteFoods(Arrays.asList("algae", "shrimp"))
				.build();
		System.out.println(flamingo);
	}
}
