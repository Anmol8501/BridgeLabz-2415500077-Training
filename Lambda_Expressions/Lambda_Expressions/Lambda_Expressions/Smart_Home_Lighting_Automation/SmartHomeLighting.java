package Lambda_Expressions.Smart_Home_Lighting_Automation;

public class SmartHomeLighting {
    public static void main(String[] args) {
        Runnable motionTrigger = () -> System.out.println("Motion detected -> Turning ON lights to bright white mode!");
        Runnable nightTrigger = () -> System.out.println("Night time -> Switching lights to warm dim mode!");
        Runnable voiceCommand = () -> System.out.println("Voice Command: 'Party Mode' -> Activating color cycle mode!");

        System.out.println("=== Smart Home Lighting System ===");
        motionTrigger.run();
        nightTrigger.run();
        voiceCommand.run();
    }
}