package PendafataranPTSemut79.model;

import PendafataranPTSemut79.abstrackclass.Person;
import PendafataranPTSemut79.controller.CalculateSalary;
import PendafataranPTSemut79.inteface.IPlacement;

public class Employe extends Person implements IPlacement {
    private String employeId;
    private double salary;
    private String jobDesc;
    private String placment;
    private double umk;
    private String bagian;

    public Employe(String name, String addres, int age, String employeId, double salary, String jobDesc, String placment, double umk, String bagian) {
        super(name, addres, age);
        this.employeId = employeId;
        this.salary = salary;
        this.jobDesc = jobDesc;
        this.placment = placment;
        this.umk = umk;
        this.bagian = bagian;
        getGajiPerkota();
        getGajiSalary();
    }

    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getPlacment() {
        return placment;
    }

    public void setPlacment(String placment) {
        this.placment = placment;
    }

    public double getUmk() {
        return umk;
    }

    public void setUmk(double umk) {
        this.umk = umk;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    @Override
    public void getGajiPerkota() {
        setUmk(CalculateSalary.calculateUMK(getPlacment()));
    }

    @Override
    public void getGajiSalary() {
        setSalary(CalculateSalary.calculateSalary(getUmk(),getBagian()));
    }

}
