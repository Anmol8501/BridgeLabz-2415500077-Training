package package_access_modifier_control;

import package_access_modifier_control.com.access.two.Derived;

public class MainApp {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.testAccess();
    }
}
