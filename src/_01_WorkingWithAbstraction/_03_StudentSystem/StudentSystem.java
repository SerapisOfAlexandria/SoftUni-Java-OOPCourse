package _01_WorkingWithAbstraction._03_StudentSystem;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentSystem {
    private Map<String, Student> repo = new HashMap<>();

    public StudentSystem() {

    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void create(String[] args) {
        var name = args[1];
        var age = Integer.parseInt(args[2]);
        var grade =Double.parseDouble(args[3]);
        boolean containsName = repo.containsKey(name);
        if (!containsName) {
            var student = new Student(name, age, grade);
            repo.put(name,student);
        }
    }

    public String getReputation(Student student) {
        String reputation = "";
        if (student.getGrade() >= 5.00) {
            reputation += " Excellent student.";
        }
        else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            reputation += " Average student.";
        }
        else {
            reputation += " Very nice person.";
        }
        return reputation;
    }

    public  void show(String[] args) {
        var name = args[1];
        boolean containsName = repo.containsKey(name);
        if (containsName) {
            var student = repo.get(name);
            String reputation = String.format("%s is %s years old.",student.getName(),student.getAge());

            reputation += getReputation(student);

            System.out.println(reputation);
        }
    }

    public void parseCommand(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] args = scanner.nextLine().split(" ");

        switch (args[0]) {
            case "Create":
                create(args);
                break;
            case "Show":
                show(args);
                break;
        }
    }
}
