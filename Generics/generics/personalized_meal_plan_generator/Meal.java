package personalized_meal_plan_generator;

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan){this.plan = plan;}
    public void showMeal(){ System.out.println("Meal Plan: " + plan.getType()); }
}