import java.util.ArrayList;
public class JobTracker {
  public static ArrayList<Job> jobs = new ArrayList<Job>();
  
  public static void addJob(Job j) {
    jobs.add(j);
  }
  
  public static void removeJob(Job j) {
    for (int i = jobs.size() - 1; i >= 0; i--) {
      if(jobs.get(i) == j) {
        jobs.remove(i);
      }
    }
  }
  
  public static ArrayList<Job> listJobs() {
    return jobs;
  }

  public static Job jobWithID(int n) {
    for (int i = 0; i < jobs.size(); i++) {
      if (jobs.get(i).getID() == n) {
        return jobs.get(i);
      }
    }
    return null;
  }

  
}