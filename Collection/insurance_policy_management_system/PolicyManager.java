package insurance_policy_management_system;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class PolicyManager {

    private HashSet<Policy> hashSet = new HashSet<>();
    private LinkedHashSet<Policy> linkedHashSet = new LinkedHashSet<>();
    private TreeSet<Policy> treeSet = new TreeSet<>();

    // Add a policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public Set<Policy> getHashSetPolicies() {
        return hashSet;
    }

    public Set<Policy> getLinkedHashSetPolicies() {
        return linkedHashSet;
    }

    public Set<Policy> getTreeSetPolicies() {
        return treeSet;
    }

    // Policies expiring within 30 days
    public List<Policy> getExpiringSoon() {
        List<Policy> list = new ArrayList<>();
        for (Policy p : hashSet) {
            long days = ChronoUnit.DAYS.between(LocalDate.now(), p.getExpiryDate());
            if (days <= 30) list.add(p);
        }
        return list;
    }

    // Policies by coverage type
    public List<Policy> getByCoverage(String type) {
        List<Policy> list = new ArrayList<>();
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                list.add(p);
            }
        }
        return list;
    }

    // Duplicate detection
    public void findDuplicates(List<Policy> policies) {
        HashSet<String> seen = new HashSet<>();
        for (Policy p : policies) {
            if (seen.contains(p.getPolicyNumber())) {
                System.out.println("Duplicate → " + p);
            } else {
                seen.add(p.getPolicyNumber());
            }
        }
    }
}
