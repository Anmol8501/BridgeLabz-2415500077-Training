package ai_driven_resume_screening_system;

class Resume<T extends JobRole> {
    private T jobRole;
    public Resume(T jobRole){this.jobRole = jobRole;}
    public T getJobRole(){return jobRole;}
}