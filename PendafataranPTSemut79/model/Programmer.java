package PendafataranPTSemut79.model;

public class Programmer extends Analyst{
    private String langguae;
    private int experiance;

    public Programmer(String name, String addres, int age, String employeId, double salary, String jobDesc, String placment, double umk, String bagian, double allowance, String langguae, int experiance) {
        super(name, addres, age, employeId, salary, jobDesc, placment, umk, bagian, allowance);
        this.langguae = langguae;
        this.experiance = experiance;
        calculateAllowance();
    }

    public String getLangguae() {
        return langguae;
    }

    public void setLangguae(String langguae) {
        this.langguae = langguae;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    @Override
    public void calculateAllowance() {
        super.calculateAllowance();
        if (getBagian().equalsIgnoreCase("programmer")&&getExperiance()>4){
            setAllowance(getSalary()*0.2);
        } else if (getBagian().equalsIgnoreCase("programmer")&&getExperiance()<4) {
            setAllowance(getSalary()*0.1);
        }
    }
}
