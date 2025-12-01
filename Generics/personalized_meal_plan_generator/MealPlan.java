package personalized_meal_plan_generator;

interface MealPlan { 
	String getType(); 
	}
class VegetarianMeal implements MealPlan { 
	public String getType(){return "Vegetarian";} 
	}
class VeganMeal implements MealPlan {
	public String getType(){return "Vegan";} 
	}
