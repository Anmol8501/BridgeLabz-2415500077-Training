package package_access_modifier_control.com.access.two;
import package_access_modifier_control.com.access.one.Base;

public class Derived extends Base {
    public void testAccess() {
        publicMethod();      // ✅ Accessible
        protectedMethod();   // ✅ Accessible (via inheritance)
        // defaultMethod();  // ❌ Not accessible (different package)
        // privateMethod();  // ❌ Not accessible
    }

}
