package PendafataranPTSemut79.controller;

import PendafataranPTSemut79.model.Analyst;
import PendafataranPTSemut79.model.Employe;
import PendafataranPTSemut79.model.Programmer;
import PendafataranPTSemut79.model.ProjectLeader;

import java.text.DecimalFormat;
import java.util.*;

public class MenampilkanData {
    public static List<Employe> getViewData(List<Employe> list) {
        Set<String> displayedIds = new HashSet<>();
        List<Employe> listTampung = new ArrayList<>();
        for (Employe employe : list) {
            String employeId = employe.getEmployeId();
            if (!displayedIds.contains(employeId)) {
                displayedIds.add(employeId);
                listTampung.add(employe);
            }
        }
        return listTampung;
    }


    public static List<Employe> getViewDataPayroll(List<Employe> list) {
        Set<String> displayedIds = new HashSet<>();
        List<Employe> listTampung = new ArrayList<>();
        double salary = 0;
        double allowance=0;
        int num =0;

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                            MENU DATA PAYROLL                                                        |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-12s | %-15s | %-20s | %-10s | %-15s | %-15s |%n",
                "No", "Employee Id", "Name", "Job Desc", "Placement", "Allowanace", "Salary");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");


        for (Employe employe : list) {
            String employeId = employe.getEmployeId();
            if (!displayedIds.contains(employeId)) {
                displayedIds.add(employeId);
                num++;

                if (employe instanceof Programmer) {
                    salary = employe.getSalary();
                    allowance = ((Programmer) employe).getAllowance();
                } else if (employe instanceof Analyst) {
                    salary = employe.getSalary();
                    allowance = ((Analyst) employe).getAllowance();
                } else if (employe instanceof ProjectLeader) {
                    salary = employe.getSalary();
                    allowance = ((ProjectLeader) employe).getAllowance();
                }else {
                    salary=employe.getSalary();
                    allowance = 0;
                }


                DecimalFormat currencyFormat = new DecimalFormat("Rp ###,###.00");

                System.out.printf("| %-10s | %-12s | %-15s | %-20s | %-10s | %-15s | %-15s |%n",
                        num, employe.getEmployeId(), employe.getName(), employe.getJobDesc(), employe.getPlacment(), currencyFormat.format(allowance), currencyFormat.format(salary));
                listTampung.add(employe);
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        return listTampung;
    }
}
