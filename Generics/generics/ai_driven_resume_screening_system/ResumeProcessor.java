package ai_driven_resume_screening_system;
import java.util.*;

class ResumeProcessor {
    public static void processAll(List<? extends JobRole> roles){
        for(JobRole role: roles) System.out.println("Processing resume for " + role);
    }

    public static void main(String[] args){
        List<JobRole> list = List.of(new SoftwareEngineer(), new DataScientist());
        processAll(list);
    }
}
