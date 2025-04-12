abstract class JobRole {
    private String candidateName;
    private int experience;
    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }
    public String getCandidateInfo() {
        return "Candidate: " + candidateName + ", Experience: " + experience + " years";
    }
    public abstract String evaluate();
}
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }
    public String evaluate() {
        return getCandidateInfo() + " | Role: Software Engineer | Result: " +
               (experience >= 2 ? "Shortlisted" : "Rejected");
    }
}
class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experience) {
        super(candidateName, experience);
    }
    public String evaluate() {
        return getCandidateInfo() + " | Role: Data Scientist | Result: " +
               (experience >= 3 ? "Shortlisted" : "Rejected");
    }
}
class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experience) {
        super(candidateName, experience);
    }
    public String evaluate() {
        return getCandidateInfo() + " | Role: Product Manager | Result: " +
               (experience >= 5 ? "Shortlisted" : "Rejected");
    }
}
class Resume<T extends JobRole> {
    private T jobRole;
    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }
    public String processResume() {
        return jobRole.evaluate();
    }
    public T getJobRole() {
        return jobRole;
    }
}
import java.util.List;
class ScreeningPipeline {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println(role.evaluate());
        }
    }
    public static <T extends JobRole> boolean isEligible(Resume<T> resume) {
        return resume.getJobRole().evaluate().contains("Shortlisted");
    }
}
import java.util.ArrayList;
public class e {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice", 3));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob", 2));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Carol", 6));
        System.out.println("Processing Individual Resumes:");
        System.out.println(seResume.processResume());
        System.out.println(dsResume.processResume());
        System.out.println(pmResume.processResume());
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(seResume.getJobRole());
        allResumes.add(dsResume.getJobRole());
        allResumes.add(pmResume.getJobRole());
        System.out.println("\nScreening All Candidates:");
        ScreeningPipeline.screenResumes(allResumes);
    }
}