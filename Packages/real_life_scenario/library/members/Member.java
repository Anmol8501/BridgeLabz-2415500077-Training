package real_life_scenario.library.members;

public class Member {
    public String name;
    public int memberId;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void showMember() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}
