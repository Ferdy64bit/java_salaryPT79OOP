package PendafataranPTSemut79.MainMenu;



import PendafataranPTSemut79.controller.Cetak;
import PendafataranPTSemut79.controller.CrudData;
import PendafataranPTSemut79.controller.MenampilkanData;
import PendafataranPTSemut79.controller.SeacrhData;
import PendafataranPTSemut79.model.Employe;
import PendafataranPTSemut79.ripository.RipositoryEmploye;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    private Scanner scanner = new Scanner(System.in);


    public void display() {
        RipositoryEmploye ripositoryEmploye = new RipositoryEmploye();
        List<Employe> list = ripositoryEmploye.getAllEmployee();
        List<Employe> listAddData = new ArrayList<>();
        for (Employe employe : list){
            listAddData.add(employe);
        }
        int createId = 3;

        int choice;
        do {
            System.out.println();
            System.out.println("======== Main Menu ========");
            System.out.println("1. Edit Employe");
            System.out.println("2. Tambah Employee");
            System.out.println("3. Data Employee");
            System.out.println("4. Data Payroll");
            System.out.println("5. Delete Employee");
            System.out.println("6. Searching");
            System.out.println("0. Exit");



            System.out.print("Pilih : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masuk ID Employee And : ");
                    String id = scanner.nextLine();
                    List<Employe> listUbah = CrudData.getEditData(listAddData,id);
                    for (Employe cekup : listUbah){
                            listAddData.add(cekup);
                    }
                    break;
                case 2:
                    createId++;
                    List<Employe> listTambah = CrudData.addData(listAddData,createId);
                    for (Employe cekUp : listTambah){
                            listAddData.add(cekUp);
                    }
                    break;
                case 3:
                    List<Employe>employeList = MenampilkanData.getViewData(listAddData);
                    Cetak.printTable(employeList);
                    break;
                case 4:
                    List<Employe> listPayroll = MenampilkanData.getViewDataPayroll(listAddData);
                    for (Employe cekup : listPayroll){
                            listAddData.add(cekup);
                    }
                    break;
                case 5:
                    System.out.print("Masukan ID Employee Anda : ");
                    String cekID = scanner.nextLine();

                    System.out.println("Apakah Anda yakin Ingin Menghapus Data Ini : ");
                    System.out.print("Yakin/Batal  (Y/N) : ");
                    String cek = scanner.nextLine();
                    if (cek.equalsIgnoreCase("y")){
                        List<Employe>isDelete =  CrudData.getDeleteData(listAddData,cekID);
                        for (Employe cekup : isDelete){
                            if (listAddData.contains(cekup)){
                                listAddData.add(cekup);
                            }
                        }
                    }else {
                        System.out.println("input salah");
                    }
                    break;
                case 6:
                    System.out.println("Masukan Cabang / Pusat yang Mau Dicari " + "( Garut /"+" Bandung /"+" Jakarta /"+" Bekasi /" +" Bogor / )");
                    System.out.print("Pilih Cabang : ");
                    String tempat = scanner.nextLine();
                    SeacrhData.getSearch(listAddData,tempat);
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Menu Tidak Ada");
            }
        } while (choice != 0);
    }
}


