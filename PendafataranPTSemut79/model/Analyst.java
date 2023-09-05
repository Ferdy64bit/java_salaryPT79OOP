package PendafataranPTSemut79.model;

public class Analyst extends Employe{
    private double allowance;

    public Analyst(String name, String addres, int age, String employeId, double salary, String jobDesc, String placment, double umk, String bagian, double allowance) {
        super(name, addres, age, employeId, salary, jobDesc, placment, umk, bagian);
        this.allowance = allowance;
        calculateAllowance();
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void calculateAllowance(){
        if (getBagian().equalsIgnoreCase("analyst")){
            setAllowance(getSalary()*0.05);
        }
    }
}
