package Lambda_Expressions.Notification_Filtering;

public class Alert {
    String type;
    int priority;

    Alert(String type, int priority) {
        this.type = type;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Alert: " + type + " | Priority: " + priority;
    }
}
