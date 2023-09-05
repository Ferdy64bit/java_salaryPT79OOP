package PendafataranPTSemut79.controller;

import PendafataranPTSemut79.inteface.IPlacement;
import PendafataranPTSemut79.model.Employe;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SeacrhData{
    public static void getSearch(List<Employe>isFind,String pleacment){
        Set<String> displayedIds = new HashSet<>();
        int num =0;
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("                                            MENU DATA SEARCH                                                    |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-12s | %-15s | %-20s | %-10s | %-15s | %-10s |%n",
                "No", "Employee Id", "Name", "Adrees", "Age", "Job Desc", "Placement");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        for (Employe employe : isFind) {
            String employeId = employe.getEmployeId();
            if (!displayedIds.contains(employeId)) {
                if (employe.getPlacment().equalsIgnoreCase(pleacment)){
                    displayedIds.add(employeId);
                    num++;
                    System.out.printf("| %-10s | %-12s | %-15s | %-20s | %-10s | %-15s | %-10s |%n",
                            num, employe.getEmployeId(), employe.getName(), employe.getAddres(), employe.getAge(), employe.getJobDesc(), employe.getPlacment());

                }
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }
}
