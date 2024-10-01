//     // This method takes 2 inputs of datatype integer
//     public void methodName(int parameter1, int parameter2){ 
//         // Method body to write code


//         // this method has a return set to void, so it wil return nothing
//     }
// }
public class UserDefinedMethods {
    public static String orderPizza(String pizzaType, String extraTopping){
        String pizza = "Make a " + pizzaType + " pizza with " + extraTopping + ".";
        return pizza;
    }
    public static void main(String[] args) {
        // Call the function to order a pizza
        String firstPizza = orderPizza("Pepperoni", "Extra Cheese");
        System.out.println(firstPizza);

        String secondPizza = orderPizza("Vegetable", "Extra Olives");
        System.out.println(secondPizza);
    }    
}
