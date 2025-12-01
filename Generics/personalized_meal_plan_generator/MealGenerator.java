package personalized_meal_plan_generator;

class MealGenerator {
    public static <T extends MealPlan> void generateMeal(T meal){
        System.out.println("Generated meal plan: " + meal.getType());
    }

    public static void main(String[] args){
        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        veg.showMeal();
        generateMeal(new VeganMeal());
    }
}