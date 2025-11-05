interface MealPlan { String getType(); }

class VegetarianMeal implements MealPlan { public String getType(){ return "Vegetarian"; } }
class VeganMeal implements MealPlan { public String getType(){ return "Vegan"; } }

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan){ this.plan = plan; }
}

public class MealPlanGenerator {
    public static <T extends MealPlan> void generateMeal(T meal){
        System.out.println("Generating " + meal.getType() + " meal plan...");
    }

    public static void main(String[] args){
        generateMeal(new VegetarianMeal());
        generateMeal(new VeganMeal());
    }
}
