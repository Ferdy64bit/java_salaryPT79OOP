package PendafataranPTSemut79.controller;

import PendafataranPTSemut79.model.Analyst;
import PendafataranPTSemut79.model.Employe;
import PendafataranPTSemut79.model.Programmer;
import PendafataranPTSemut79.model.ProjectLeader;

import java.text.DecimalFormat;
import java.util.*;

public class CrudData {
    public static List<Employe> addData(List<Employe> list,int id){
        List<Employe> list3 = new ArrayList<>();
        List<Employe> cek = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean isAdd = false;
        System.out.println("Menu Add data ");
        System.out.println("( Employee / Programmer / Project Leader / Analyst )");
        System.out.print("Masukan Bagian Anda : ");
        String bagian = scanner.nextLine();

        System.out.print("Masukan JobDesc Anda : ");
        String job = scanner.nextLine();

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Age : ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Adress : ");
        String adres = scanner.nextLine();

        System.out.println("Daftar perusahaan ");
        System.out.println("Cabang Dan Pusat");
        System.out.println("Garut /"+" Bandung /"+" Jakarta /"+" Bekasi /" +" Bogor /");

        System.out.print("Di Tempatkan Di : ");
        String tempat = scanner.nextLine();


        DecimalFormat currency = new DecimalFormat("000");


        for (Employe i : list){
            if (i.getBagian().equalsIgnoreCase(bagian)) {
                Employe newEmploye = null;
                switch (bagian.toLowerCase()) {
                    case "employee":
                        String idEmploye = "Emp-" + currency.format(id++);
                        newEmploye = new Employe(nama, adres, age, idEmploye, 0, job, tempat, 0, bagian);
                        isAdd = true;
                        break;
                    case "programmer":
                        String idProgram = "Prog-" + currency.format(id++);
                        System.out.print("Programmer Langguae : ");
                        String langguae = scanner.nextLine();
                        System.out.print("Experience : ");
                        int exprience = scanner.nextInt();

                        newEmploye = new Programmer(nama, adres, age, idProgram, 0, job, tempat, 0, bagian, 0, langguae, exprience);
                        isAdd = true;
                        break;
                    case "project leader":
                        String idProLeader= "PL-" + currency.format(id++);
                        System.out.print("Jumlah Project Saat ini : ");
                        int project = scanner.nextInt();

                        newEmploye = new ProjectLeader(nama, adres, age, idProLeader, 0, job, tempat, 0, bagian, 0, project);
                        isAdd = true;
                        break;
                    case "analyst":
                        String idAnalyst = "AL-" + currency.format(id++);

                        newEmploye = new Analyst(nama, adres, age, idAnalyst, 0, job, tempat, 0, bagian, 0);
                        isAdd = true;
                        break;
                    default:
                        id--;
                        break;
                }
                if (isAdd){
                    System.out.println();
                    System.out.println("Data berhasil di tambahkan");
                    cek.add(newEmploye);
                    for (Employe employe : cek){
                        System.out.println();
                        System.out.print("Employee id : ");
                        System.out.println(employe.getEmployeId());
                        System.out.print("");
                        System.out.print("Nama : ");
                        System.out.println(employe.getName());
                        System.out.println("Di tugaskan di : ");
                        System.out.println(employe.getPlacment());
                    }
                }
                if (newEmploye != null) {
                    list3.add(newEmploye);
                    break;
                }

            }
        }
        if (!isAdd){
            System.out.println("input Gagal Periksa Kemabali inputan anda!!!");
        }

        return list3;
    }
    public static List<Employe> getEditData(List<Employe>list,String id){
        boolean cek = false;
        Scanner scanner = new Scanner(System.in);
        List<Employe> employeList = new ArrayList<>();
        for (Employe i : list){
            if (i.getEmployeId().equalsIgnoreCase(id)){
                if (i.getEmployeId().contains(i.getEmployeId())){
                    System.out.print("masukan kota : ");
                    String ubah = scanner.nextLine();
                    i.setPlacment(ubah);
                    i.getGajiPerkota();
                    i.getGajiSalary();
                    if (i.getBagian().equalsIgnoreCase("programmer")){
                        ((Programmer)i).calculateAllowance();
                    } else if (i.getBagian().equalsIgnoreCase("analyst")) {
                        ((Analyst)i).calculateAllowance();
                    } else if (i.getBagian().equalsIgnoreCase("Project Leader")) {
                        ((ProjectLeader)i).calculateAllowance();
                    }
                    cek = true;
                    break;
                }
            }
            employeList.add(i);//ragu
        }
        if (cek){
            System.out.println("data berhasil di ubah");
            System.out.println(" terimaksih telah datang!!!");
        }else {
            System.out.println("terjadi kesalahan");
        }

        return employeList;
    }

    public static List<Employe> getDeleteData(List<Employe> listDelete, String id) {
        List<Employe> deletedList = new ArrayList<>();
        Iterator<Employe> iterator = listDelete.iterator();
        boolean isDelete = false;

        while (iterator.hasNext()) {
            Employe employe = iterator.next();
            if (employe.getEmployeId().equalsIgnoreCase(id)) {
                deletedList.add(employe);
                iterator.remove();
                isDelete = true;
            }
        }
        if (isDelete){
            System.out.println();
            System.out.println("data berhasil di hapus");
            System.out.println("Terimakasih Telah datang ");
        }else {
            System.out.println();
            System.out.println("input yang anda masukan salah");
        }
        return deletedList;
    }



}
