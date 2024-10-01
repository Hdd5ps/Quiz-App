public class greetTheUser {
    public static void main(String[] args){
        // Using if=else
        String greeting;
        int hour = 11; 
        // Try assigning hour different values
        if (hour < 12){
            greeting = "Good morning";
        }
        else {
            if (hour < 18){
                greeting = "Good afternoon";
            }
            else {
                greeting = "Good evening";
            }
        }
    }
}
