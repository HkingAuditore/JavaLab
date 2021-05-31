package LabFive.HashSetLab;

import java.util.Scanner;

public class NameHashSetTest {
    public static void main(String[] args) {
        NameHashSet nameHashSet = new NameHashSet();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Add a name to set, use end to terminate input:");
            String name = scanner.nextLine();
            if(name.equals("end"))
                break;
            if(nameHashSet.addName(name)){
                System.out.println(name + " inserted");
            }else{
                System.out.println(name + " exists in set");
            }
        }

        while (true){
            System.out.println("Search a name, use end to terminate searching:");
            String name = scanner.nextLine();
            if(name.equals("end"))
                break;
            if(nameHashSet.search(name)){
                System.out.println(name + " found in set");
            }else{
                System.out.println(name + " not found in set");
            }
        }

    }
}
