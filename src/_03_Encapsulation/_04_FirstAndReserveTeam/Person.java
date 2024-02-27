package _03_Encapsulation._04_FirstAndReserveTeam;

import java.text.DecimalFormat;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setSalary(salary);
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        bonus = this.getAge() < 30 ? bonus / 2 : bonus;
        this.setSalary(this.getSalary() + (this.getSalary() * bonus) / 100);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0##");
        String formattedNumber = decimalFormat.format(salary);
        if (formattedNumber.equals(".")) {
            formattedNumber += "0";
        }
        return String.format("%s %s gets %s leva", getFirstName(), getLastName(), formattedNumber);
    }
}
