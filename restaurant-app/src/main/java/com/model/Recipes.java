package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Recipes {
	@Id
	@GeneratedValue
	public int id;
	public String name;
	public String DateTime;
	public String TypeOfDish;
	public int SuitableFor;
	public String Ingredients;
	public String CookingInstructions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	public String getTypeOfDish() {
		return TypeOfDish;
	}
	public void setTypeOfDish(String typeOfDish) {
		TypeOfDish = typeOfDish;
	}
	public int getSuitableFor() {
		return SuitableFor;
	}
	public void setSuitableFor(int suitableFor) {
		SuitableFor = suitableFor;
	}
	public String getIngredients() {
		return Ingredients;
	}
	public void setIngredients(String ingredients) {
		Ingredients = ingredients;
	}
	public String getCookingInstructions() {
		return CookingInstructions;
	}
	public void setCookingInstructions(String cookingInstructions) {
		CookingInstructions = cookingInstructions;
	}
	@Override
	public String toString() {
		return "Recipes [id=" + id + ", name=" + name + ", DateTime=" + DateTime + ", TypeOfDish=" + TypeOfDish
				+ ", SuitableFor=" + SuitableFor + ", Ingredients=" + Ingredients + ", CookingInstructions="
				+ CookingInstructions + "]";
	}
	

}
