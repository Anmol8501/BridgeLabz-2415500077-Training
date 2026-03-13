package Singly_Linked_List_Social_Media_Friend_Connections;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----- Social Media -----");
        SocialList social = new SocialList();
        social.addConnection(1, "Rahul", 20, null);
        social.addConnection(2, "Sneha", 22, null);
        social.removeConnection(1);
        social.findMutualFriends(1, 2);
        social.displayFriends("Rahul");
        social.search("Rahul", 1);
        social.countFriends("Rahul");
        social.displayAll();
    }
}
