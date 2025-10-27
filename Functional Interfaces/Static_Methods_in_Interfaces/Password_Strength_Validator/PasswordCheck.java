package Static_Methods_in_Interfaces.Password_Strength_Validator;
import java.util.*;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password to check:");
        String pass = sc.nextLine();
        
        if (ISecurityUtils.isStrongPassword(pass)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }

        sc.close();
    }
}
