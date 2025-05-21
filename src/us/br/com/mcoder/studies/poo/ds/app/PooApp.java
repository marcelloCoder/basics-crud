package us.br.com.mcoder.studies.poo.ds.app;

import us.br.com.mcoder.studies.poo.ds.entities.Department;
import us.br.com.mcoder.studies.poo.ds.entities.HourContract;
import us.br.com.mcoder.studies.poo.ds.entities.Worker;
import us.br.com.mcoder.studies.poo.ds.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PooApp {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.   US);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department name:");
        String departmentName = sc.nextLine();
        System.out.println("Enter Worker Data:");
        System.out.println("Name:");
        String workerName = sc.nextLine();
        System.out.println("Level:");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary:");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName,
                WorkerLevel.valueOf(workerLevel),
                baseSalary,
                new Department(departmentName));
        System.out.println("How many contracts you need?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract " + i + " datar: ");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = simpleDateFormat.parse(sc.next());
            System.out.println("Value Per Hour");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration :");
            int hour = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hour);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year (MM/yyyy) : ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name : " + worker.getName());
        System.out.println("Department : " + worker.getDepartment().getName());
        System.out.println("Income for : " + monthAndYear + " : " + String.format("%.2f", worker.income(year, month)));
        sc.close();
    }
}
