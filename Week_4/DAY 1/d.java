interface MealPlan {
    String getMealName();
    boolean isValid();
}
class VegetarianMeal implements MealPlan {
    private String name;
    public VegetarianMeal(String name) {
        this.name = name;
    }
    public String getMealName() {
        return name;
    }
    public boolean isValid() {
        return !name.toLowerCase().contains("meat");
    }
}
class VeganMeal implements MealPlan {
    private String name;
    public VeganMeal(String name) {
        this.name = name;
    }
    public String getMealName() {
        return name;
    }
    public boolean isValid() {
        return !name.toLowerCase().contains("animal") && !name.toLowerCase().contains("milk");
    }
}
class KetoMeal implements MealPlan {
    private String name;
    public KetoMeal(String name) {
        this.name = name;
    }
    public String getMealName() {
        return name;
    }
    public boolean isValid() {
        return !name.toLowerCase().contains("carbs");
    }
}
class HighProteinMeal implements MealPlan {
    private String name;
    public HighProteinMeal(String name) {
        this.name = name;
    }
    public String getMealName() {
        return name;
    }
    public boolean isValid() {
        return name.toLowerCase().contains("protein") || name.toLowerCase().contains("egg");
    }
}
class Meal<T extends MealPlan> {
    private T mealType;
    public Meal(T mealType) {
        this.mealType = mealType;
    }
    public T getMealType() {
        return mealType;
    }
    public String getMealDetails() {
        return "Meal: " + mealType.getMealName();
    }
}
class MealPlanGenerator {
    public static <T extends MealPlan> T generateMealPlan(T meal) {
        if (meal.isValid()) {
            System.out.println("Meal is valid: " + meal.getMealName());
            return meal;
        } else {
            throw new IllegalArgumentException("Invalid meal: " + meal.getMealName());
        }
    }
}
public class d {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal("Paneer Curry");
        VeganMeal vegan = new VeganMeal("Quinoa Salad");
        KetoMeal keto = new KetoMeal("Grilled Chicken");
        HighProteinMeal highProtein = new HighProteinMeal("Protein Smoothie");
        Meal<VegetarianMeal> vegMeal = new Meal<>(MealPlanGenerator.generateMealPlan(veg));
        Meal<VeganMeal> veganMeal = new Meal<>(MealPlanGenerator.generateMealPlan(vegan));
        Meal<KetoMeal> ketoMeal = new Meal<>(MealPlanGenerator.generateMealPlan(keto));
        Meal<HighProteinMeal> hpMeal = new Meal<>(MealPlanGenerator.generateMealPlan(highProtein));
        System.out.println(vegMeal.getMealDetails());
        System.out.println(veganMeal.getMealDetails());
        System.out.println(ketoMeal.getMealDetails());
        System.out.println(hpMeal.getMealDetails());
    }
}