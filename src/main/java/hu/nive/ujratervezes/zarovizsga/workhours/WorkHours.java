package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkHours {

    public String minWork(String file) {
        String lazyWorkerName = "";
        int lazyWorkedHours = 0;
        String lazyDate = "";
        try {
            Scanner myScanner = new Scanner(new File("src/test/resources/hu/nive/ujratervezes/zarovizsga/workhours/workhours.txt"));
            myScanner.useDelimiter(",|\r|\n");
            String actualWorkerName;
            int actualWorkedHours;
            String actualDate;
            while (myScanner.hasNext()) {
                actualWorkerName = myScanner.next();
                actualWorkedHours = Integer.parseInt(myScanner.next());
                actualDate = myScanner.next();
                if (lazyWorkerName.equals("") || actualWorkedHours < lazyWorkedHours) {
                    lazyWorkerName = actualWorkerName;
                    lazyWorkedHours = actualWorkedHours;
                    lazyDate = actualDate;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lazyWorkerName + ": " + lazyDate;
    }
}
