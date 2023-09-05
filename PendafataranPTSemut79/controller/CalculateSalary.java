package PendafataranPTSemut79.controller;

import PendafataranPTSemut79.inteface.IPlacement;

public class CalculateSalary implements IPlacement {
    public static double calculateUMK(String kota){
        double umk = 0;
        boolean cek = true;
        String kotaku[] = {"garut","bandung","jakarta","bekasi","bogor"};
        for (int i =0; i< kotaku.length; i++){
            if (kotaku[i].equalsIgnoreCase(kota)){
                umk = UMK[i];
                cek = false;
            }
        }
        if (cek){
            System.out.println("Penempatan Tidak Di temukan");
        }
        return umk;
    }

    public static double calculateSalary(double umk,String bagian){
        double percentage[]= {1,1.5,2,1.6};
        double salary = 0;
        for (int i =0; i< JOB_DESC.length; i++){
            if (JOB_DESC[i].equalsIgnoreCase(bagian)){
                salary = umk * percentage[i];
            }
        }
        return salary;
    }
}
