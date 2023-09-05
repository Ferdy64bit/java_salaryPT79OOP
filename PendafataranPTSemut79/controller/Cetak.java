package PendafataranPTSemut79.controller;

import PendafataranPTSemut79.model.Employe;

import java.util.List;

public class Cetak {
    public static void printTable(List<Employe> list) {
        int num =0;
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                         DATA EMPLOYEES                                                              |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-12s | %-15s | %-20s | %-10s | %-20s | %-10s |%n",
                "No", "Employee Id", "Name", "Adrees", "Age", "Job Desc", "Placement");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");


        for (Employe employe : list) {
            num++;
            System.out.printf("| %-10s | %-12s | %-15s | %-20s | %-10s | %-20s | %-10s |%n",
                    num, employe.getEmployeId(), employe.getName(), employe.getAddres(), employe.getAge(), employe.getJobDesc(), employe.getPlacment());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

    }





}
