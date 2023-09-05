package PendafataranPTSemut79.ripository;

import PendafataranPTSemut79.model.Analyst;
import PendafataranPTSemut79.model.Employe;
import PendafataranPTSemut79.model.Programmer;
import PendafataranPTSemut79.model.ProjectLeader;

import java.util.Arrays;
import java.util.List;

public class RipositoryEmploye {
    public List<Employe> getAllEmployee(){
        Employe employe1 = new Employe("Susi","Bandung",27,"Emp-001",0,"Admin","Jakarta",0,"Employee");
        Employe employe2 = new Employe("Anto","Bandung",35,"Emp-002",0,"Office Boy","Bandung",0,"Employee");
        Employe employe3 = new Employe("Riman","Jakarta",28,"Emp-003",0,"Human Resource Dev","Bandung",0,"Employee");

        Analyst analyst1 = new Analyst("Indah","Garut",25,"AL-001",0,"Analyst","Jakarta",0,"Analyst",0);
        Analyst analyst2 = new Analyst("Puspa","Bandung",30,"AL-002",0,"Analyst","Bekasi",0,"Analyst",0);
        Analyst analyst3 = new Analyst("Sari","Jakarta",28,"AL-003",0,"Analyst","Bogor",0,"Analyst",0);

        Programmer programmer1 = new Programmer("Budi","Bandung",25,"Prog-001",0,"Back End Dev","Jakarta",0,"Programmer",0,"Java",2);
        Programmer programmer2 = new Programmer("Ani","Bandung",30,"Prog-002",0,"Front End Dev","Bandung",0,"Programmer",0,"React Js",6);
        Programmer programmer3 = new Programmer("Ujang","Jakarta",28,"Prog-003",0,"Full Stack Dev","Bandung",0,"Programmer",0,"Kotlin",4);

        ProjectLeader projectLeader1 = new ProjectLeader("Ahmad","Bandung",25,"PL-001",0,"Project Leader","Garut",0,"Project Leader",0,2);
        ProjectLeader projectLeader2 = new ProjectLeader("Dani","Bandung",30,"PL-002",0,"Scrum Master","Bekasi",0,"Project Leader",0,1);
        ProjectLeader projectLeader3 = new ProjectLeader("Cecep","Jakarta",28,"PL-003",0,"Project Owner","Bogor",0,"Project Leader",0,4);



        List<Employe> listAllemploye = Arrays.asList(employe1,employe2,employe3,analyst1,analyst2,analyst3,programmer1,programmer2,programmer3,projectLeader1,projectLeader2,projectLeader3);
        return listAllemploye;
    }
}
