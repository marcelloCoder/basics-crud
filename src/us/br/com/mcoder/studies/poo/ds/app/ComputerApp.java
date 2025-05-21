package us.br.com.mcoder.studies.poo.ds.app;

import us.br.com.mcoder.studies.poo.ds.entities.Computer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list.size());
        System.out.println("-----------");
        for (Integer i : list){
            System.out.println(i);
        }

        List<Integer> result = list.stream().filter(x -> x.equals(9)).toList();

        System.out.println(result);

        String cpu = scanner.next();
        computer.setCpu(cpu);
        System.out.println(computer.getCpu());
    }
}
