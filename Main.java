import java.util.*;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    FileInputStream data = new FileInputStream("data.txt");
    
    /*
     * COMMANDS:
     * 1. view [JOBID]: view info of a job
     * 2. apply [JOBID]: begin an application for a job
     * 3. list recent,[CATEGORY]
     * 4. exit : ends program
     */
    /*
     * // Regular text colors
     * public static final String RESET = "\u001B[0m";
     * public static final String BLACK = "\u001B[30m";
     * public static final String RED = "\u001B[31m";
     * public static final String GREEN = "\u001B[32m";
     * public static final String YELLOW = "\u001B[33m";
     * public static final String BLUE = "\u001B[34m";
     * public static final String MAGENTA = "\u001B[35m";
     * public static final String CYAN = "\u001B[36m";
     * public static final String WHITE = "\u001B[37m";
     * 
     * // Bright text colors
     * public static final String BRIGHT_BLACK = "\u001B[30;1m";
     * public static final String BRIGHT_RED = "\u001B[31;1m";
     * public static final String BRIGHT_GREEN = "\u001B[32;1m";
     * public static final String BRIGHT_YELLOW = "\u001B[33;1m";
     * public static final String BRIGHT_BLUE = "\u001B[34;1m";
     * public static final String BRIGHT_MAGENTA = "\u001B[35;1m";
     * public static final String BRIGHT_CYAN = "\u001B[36;1m";
     * public static final String BRIGHT_WHITE = "\u001B[37;1m";
     * 
     * // Background colors
     * public static final String BACKGROUND_BLACK = "\u001B[40m";
     * public static final String BACKGROUND_RED = "\u001B[41m";
     * public static final String BACKGROUND_GREEN = "\u001B[42m";
     * public static final String BACKGROUND_YELLOW = "\u001B[43m";
     * public static final String BACKGROUND_BLUE = "\u001B[44m";
     * public static final String BACKGROUND_MAGENTA = "\u001B[45m";
     * public static final String BACKGROUND_CYAN = "\u001B[46m";
     * public static final String BACKGROUND_WHITE = "\u001B[47m";
     * 
     * // Bright background colors
     * public static final String BRIGHT_BACKGROUND_BLACK = "\u001B[40;1m";
     * public static final String BRIGHT_BACKGROUND_RED = "\u001B[41;1m";
     * public static final String BRIGHT_BACKGROUND_GREEN = "\u001B[42;1m";
     * public static final String BRIGHT_BACKGROUND_YELLOW = "\u001B[43;1m";
     * public static final String BRIGHT_BACKGROUND_BLUE = "\u001B[44;1m";
     * public static final String BRIGHT_BACKGROUND_MAGENTA = "\u001B[45;1m";
     * public static final String BRIGHT_BACKGROUND_CYAN = "\u001B[46;1m";
     * public static final String BRIGHT_BACKGROUND_WHITE = "\u001B[47;1m";
     */

    Job a = new Job("Manager", "Apple", 144000, 20000,
        new String[] { "MON", "TUE", "WED", "THUR", "FRI" },
        new String[] { "8:00AM-5:00PM", "8:00AM-5:00PM", "9:00AM-4:00PM", "8:00AM-5:00PM", "8:00AM-6:00PM" },
        "San Francisco, California", new String[] { "Engineering", "Management", "Technology" });

    Job b = new Job("Software Developer", "TSMC", 120000, 10000,
        new String[] { "MON", "TUE", "WED", "THUR", "FRI" },
        new String[] { "8:00AM-5:00PM", "8:00AM-5:00PM", "9:00AM-4:00PM", "8:00AM-5:00PM", "8:00AM-6:00PM" },
        "San Jose, California", new String[] { "Engineering", "Management", "Technology" });

    Job c = new Job("Cashier", "McDonalds", 14000, 0,
        new String[] { "MON", "TUE", "WED"},
        new String[] { "10:00AM-4:00PM", "10:00AM-4:00PM", "10:00AM-4:00PM"},
        "Sacramento, California", new String[] { "Restaurant"} );

        Job d = new Job("Engineering Teacher", "Branham High School", 56000, 0,
        new String[] { "MON", "TUE", "WED", "THUR", "FRI"},
        new String[] { "8:00AM-3:00PM", "8:00AM-3:00PM", "8:00AM-3:00PM", "8:00AM-3:00PM", "8:00AM-3:00PM"},
        "San Jose, California", new String[] { "Teaching", "Engineering", "High School"} );

        Job e = new Job("President", "United States", 400000, 0,
        new String[] { "MON", "TUE", "WED", "THUR", "FRI", "SAT", "SUN"},
        new String[] { "12:00AM-11:59PM", "12:00AM-11:59PM", "12:00AM-11:59PM", "12:00AM-11:59PM", "12:00AM-11:59PM", "12:00AM-11:59PM", "12:00AM-11:59PM"},
        "Washington D.C., United States", new String[] { "Politics", "Mangement", "Leadership"} );

    System.out
        .println("\u001B[34;1m==================================================================================");
    System.out.println(
        "\u001B[33;1m\n    /$$$$$  /$$$$$$  /$$$$$$$                                         \n   |__  $$ /$$__  $$| $$__  $$                                        \n      | $$| $$  \\ $$| $$  \\ $$                                        \n      | $$| $$  | $$| $$$$$$$                                         \n /$$  | $$| $$  | $$| $$__  $$                                        \n| $$  | $$| $$  | $$| $$  \\ $$                                        \n|  $$$$$$/|  $$$$$$/| $$$$$$$/                                        \n \\______/  \\______/ |_______/                                         \n                                                                      \n                                                                      \n                                                                      \n /$$$$$$$$ /$$$$$$$   /$$$$$$   /$$$$$$  /$$   /$$ /$$$$$$$$ /$$$$$$$ \n|__  $$__/| $$__  $$ /$$__  $$ /$$__  $$| $$  /$$/| $$_____/| $$__  $$\n   | $$   | $$  \\ $$| $$  \\ $$| $$  \\__/| $$ /$$/ | $$      | $$  \\ $$\n   | $$   | $$$$$$$/| $$$$$$$$| $$      | $$$$$/  | $$$$$   | $$$$$$$/\n   | $$   | $$__  $$| $$__  $$| $$      | $$  $$  | $$__/   | $$__  $$\n   | $$   | $$  \\ $$| $$  | $$| $$    $$| $$\\  $$ | $$      | $$  \\ $$\n   | $$   | $$  | $$| $$  | $$|  $$$$$$/| $$ \\  $$| $$$$$$$$| $$  | $$\n   |__/   |__/  |__/|__/  |__/ \\______/ |__/  \\__/|________/|__/  |__/\n                                                                      \n                            ");
    System.out
        .println("\u001B[34;1m==================================================================================");

    System.out.println("\u001B[34m");

    System.out.println("Here are some recent jobs you might be interested in...");

    for (int i = 0; i < 10; i++) {
      if (!(i >= JobTracker.jobs.size())) {
        System.out.println(i + 1 + ". " + JobTracker.jobs.get(i).getPosition() + " at "
        + JobTracker.jobs.get(i).getCompany() + " JOB#" + JobTracker.jobs.get(i).getID());
      }
    }

    System.out.println("\u001B[34mType \u001B[33;1mhelp \u001B[34mto view commands");

    String inp = "";

    // MAIN LOOP
    while (!inp.equals("exit")) {
      inp = input.readLine();

      // VIEW
      if ((inp.length() >= 4) && (inp.substring(0,4).equals("view"))) {
        int num = Integer.parseInt(inp.substring(inp.indexOf("view ") + 5));

        System.out.println("\u001B[44;1m                     JOB SUMMARY                  " + "\u001B[0m" + "\u001B[34m");

        System.out.println(JobTracker.jobWithID(num).getPosition() + " at " + JobTracker.jobWithID(num).getCompany() + " [JOB#" + num + "]");

        System.out.println("Starting salary of $" + JobTracker.jobWithID(num).getSalary());

        System.out.println("Starting stock options of $" + JobTracker.jobWithID(num).getStockOptions());

        System.out.println("Schedule: " + JobTracker.jobWithID(num).schedule());

        System.out.println("TAGS: " + JobTracker.jobWithID(num).tags());
      }

      // HELP
      else if ((inp.length() >= 4) && (inp.substring(0,4).equals("help"))) {
        System.out.println("COMMANDS:\n* 1. view [JOBID]: view info of a job\n* 2. apply [JOBID]: begin an application for a job\n* 3. list recent,[TAG] : list by recency, or by job category\n* 4. myapps [name] : lists your applications found in the system\n* 5. exit : ends program");
      }

      // LIST
      else if ((inp.length() >= 4) && (inp.substring(0,4).equals("list"))) {
        String type = inp.substring(inp.indexOf("list") + 5);

        if (type.equals("recent")) {
          System.out.println();
          System.out.println("Here are some recent jobs you might be interested in...");

          for (int i = 0; i < 10; i++) {
            if (!(i >= JobTracker.jobs.size())) {
              System.out.println(i + 1 + ". " + JobTracker.jobs.get(i).getPosition() + " at "
              + JobTracker.jobs.get(i).getCompany() + " JOB#" + JobTracker.jobs.get(i).getID());
            }
          }
        } 
        else {

          System.out.println("\u001B[44;1m                     JOBS WITH TAG: " + type.toUpperCase() + "                  " + "\u001B[0m" + "\u001B[34m");

          int x = 1;
          for (int k = 0; k < JobTracker.jobs.size(); k++) {
            String[] tags = JobTracker.jobs.get(k).getTags();
            for (int j = 0; j < tags.length; j++) {
              if (tags[j].toLowerCase().equals(type.toLowerCase())) {
                System.out.println(x + ". " + JobTracker.jobs.get(k).getPosition() + " at "
                    + JobTracker.jobs.get(k).getCompany() + " JOB#" + JobTracker.jobs.get(k).getID());
                    x++;
              }
            }
          }
        }
      }

      // APPLICATION
      else if ((inp.length() >= 5) && (inp.substring(0,5).equals("apply"))) {
        int num = Integer.parseInt(inp.substring(inp.indexOf("apply ") + 6));

        System.out.println("\u001B[44;1m                     APPLYING TO JOB " + JobTracker.jobWithID(num).getPosition()
            + " at " + JobTracker.jobWithID(num).getCompany() + "                  " + "\u001B[0m" + "\u001B[34m");

        boolean revise = true;
        while (revise) {

          System.out.println("Enter your name: ");
          String name = input.readLine();

          System.out.println("Write you application here:");
          System.out.println("Press ENTER to begin a new line");
          System.out.println("Enter the word END on a new line to end application");
          String application = "";
          String appinp = "";

          while (!appinp.toLowerCase().equals("end")) {
            appinp = input.readLine();
            application += appinp + "\n";
          }
          System.out.println();
          System.out.println(
              "\u001B[44;1m                     APPLICATION COMPLETE                  " + "\u001B[0m" + "\u001B[34m");
          System.out.println("Here is your application:");
          System.out.println(name + "\n" + application);

          System.out.println("Would you like to revise this application? (y/n)");

          String decision = input.readLine();

          if (decision.toLowerCase().equals("n")) {
            revise = false;
            System.out.println("Would you like to submit your application? (y/n)");
            String decision2 = input.readLine();
            if (decision2.toLowerCase().equals("y")) {
              JobTracker.jobs.get(num).addApplication(application);
              System.out.println("APPLICATION SUBMITTED");

              application = application.substring(0, application.indexOf("end"));

              try (PrintWriter out = new PrintWriter(new FileWriter("data.txt", true))) {
                out.println(name + " Applying to JOB#" + JobTracker.jobWithID(num).getID() + "\n" + application.toString());
              }
              
            }
          }
        }

      }
      
      else if ((inp.length() >= 4) && (inp.substring(0,4).equals("exit"))) {
        break;
      }

      else if ((inp.length() >= 6) && (inp.substring(0,6).equals("myapps"))) {
        String nam = inp.substring(inp.indexOf("myapps")+7);

        StringBuilder fileData = new StringBuilder();

        try (InputStream data3 = new FileInputStream("data.txt")) {
            int z = data3.read();

            while (z != -1) {
                fileData.append((char) z);
                z = data3.read();
            }
        }

        String fileDataStr = fileData.toString();

        System.out.println("\u001B[44;1m                     JOB APPLICATIONS                     " + "\u001B[0m" + "\u001B[34m");

        while (fileDataStr.contains(nam)) {
            int startIndex = fileDataStr.indexOf(nam) + nam.length() + 17;
            int endIndex = fileDataStr.indexOf('\n', startIndex);
            int j = Integer.parseInt(fileDataStr.substring(startIndex, endIndex));
            System.out.println("JOB#" + j + " - " + JobTracker.jobWithID(j).getPosition() + " at " + JobTracker.jobWithID(j).getCompany());

            fileDataStr = fileDataStr.substring(fileDataStr.indexOf(nam) + nam.length());
        }
      }

      else {
        System.out.println("Command not found.");
      }

    }



  }

}