package us.br.com.mcoder.studies.poo.ds.entities;

import us.br.com.mcoder.studies.poo.ds.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contractList = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Worker() {
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContractList() {
        return contractList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract) {
        contractList.add(contract);
    }

    public void removeContract(HourContract hourContract) {
        contractList.remove(hourContract);
    }

    public Double income(int year, int month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract c : contractList) {
            calendar.setTime(c.getDate());
            int cYear = calendar.get(Calendar.YEAR);
            int cMonth = 1 + calendar.get(Calendar.MONTH);
            if (year == cYear && month == cMonth) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
