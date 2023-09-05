package PendafataranPTSemut79.model;

public class ProjectLeader extends Analyst{
    private int totalProject;

    public ProjectLeader(String name, String addres, int age, String employeId, double salary, String jobDesc, String placment, double umk, String bagian, double allowance, int totalProject) {
        super(name, addres, age, employeId, salary, jobDesc, placment, umk, bagian, allowance);
        this.totalProject = totalProject;
        calculateAllowance();
    }

    public int getTotalProject() {
        return totalProject;
    }

    public void setTotalProject(int totalProject) {
        this.totalProject = totalProject;
    }

    @Override
    public void calculateAllowance() {
        super.calculateAllowance();
        if (getBagian().equalsIgnoreCase("Project Leader")&&getTotalProject()>=2){
            setAllowance(getSalary()*0.15);
        } else if (getBagian().equalsIgnoreCase("Project Leader")&&getTotalProject()<2) {
            setAllowance(getSalary()*0.05);
        }

    }
}
