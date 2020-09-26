package edu.brainacademy;

import java.util.Objects;

public class Co_worker {
    private String employmentDate; // дата приёма на работу
    private double salary; // зарплата
    private String presence; //присутствие

    public Co_worker(String employmentDate, double salary, String presence) {
        this.employmentDate = employmentDate;
        this.salary = salary;
        this.presence = presence;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    String comeToWork(String presence, double salary) {
        double sal = 0;
        this.presence = presence;
        this.salary = salary;
        if (presence == "At work"){
            sal =+ 100;
            salary = sal;
        }
        return "-10$ from salary";
    }
    void goToLunch(String presence){
        this.presence = presence;
        if(presence == "On Lunch"){
            System.out.println("All right");
        }
    }
    double toDoWork(String presence, double salary){
        this.presence = presence;
        this.salary = salary;
        double money = 500;
        System.out.println("Сотрудник работает");
        if(presence == "Doing work")
            return salary * money;
        else
            return salary * 0;
    }

    @Override
    public String toString() {
        return "Co_worker{" +
                "employmentDate=" + employmentDate +
                ", salary=" + salary +
                ", presence='" + presence + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Co_worker co_worker = (Co_worker) o;
        return Double.compare(co_worker.salary, salary) == 0 &&
                employmentDate.equals(co_worker.employmentDate) &&
                presence.equals(co_worker.presence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employmentDate, salary, presence);
    }
}
