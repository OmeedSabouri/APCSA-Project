import java.util.ArrayList;
public class Job {
  private String position;
  private String company;
  private double salary;
  private double stockOptions;
  private String[] days;
  private String[] hours;
  private String location;
  private String[] tags;
  private ArrayList<String> apps;
  private int ID;

  public Job(String position, String company, double salary, double stockOptions, String[] days, String[] hours, String location, String[] tags) {
    this.position = position;
    this.company = company;
    this.salary = salary;
    this.stockOptions = stockOptions;
    this.days = days;
    this.hours = hours;
    this.location = location;
    this.tags = tags;
    ID = newID.getID();

    apps = new ArrayList<String>();

    JobTracker.jobs.add(0, this);
  }


  public int getID() {
    return ID;
  }

  public String getPosition() {
    return position;
  }
  public String getCompany() {
    return company;
  }
  public double getSalary() {
    return salary;
  }
  public double getStockOptions() {
    return stockOptions;
  }
  public String[] getDays() {
    return days;
  }
  public String[] getHours() {
    return hours;
  }
  public String getLocation() {
    return location;
  }
  public String[] getTags() {
    return tags;
  }

  public String schedule() {
    String a = "";
    for (int i = 0; i < days.length-1; i++) {
        a += days[i] + " [" + hours[i] + "], ";
    }
    a += days[days.length-1] + " [";
    a += hours[hours.length-1] + "]";
    return a;
  }

  public String tags() {
    String a = "";
    for (int i = 0; i < tags.length - 1; i++) {
        a += tags[i] + ", ";
    }
    a += tags[tags.length-1];
    return a;
  }

  public void addApplication(String a) {
    apps.add(a);
  }
  
}