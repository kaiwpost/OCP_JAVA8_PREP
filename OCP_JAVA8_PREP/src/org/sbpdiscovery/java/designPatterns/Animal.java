package org.sbpdiscovery.java.designPatterns;

import java.util.List;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Animal {
	
	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	public Animal(String species, int age, List<String> favoriteFoods) {
		super();
		this.species = species;
		this.age = age;
		this.favoriteFoods = favoriteFoods;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
	}
	
	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public List<String> getFavoriteFoods() {
		return favoriteFoods;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((favoriteFoods == null) ? 0 : favoriteFoods.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (favoriteFoods == null) {
			if (other.favoriteFoods != null)
				return false;
		} else if (!favoriteFoods.equals(other.favoriteFoods))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return
			"Animal [species=" + species + ", age=" + age +
			", favoriteFoods=" + favoriteFoods + "]";
	}
}
