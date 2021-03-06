package edu.brainacademy;

import java.util.Objects;

public class Manager extends Co_worker {
    private int department;

    // Реализовать работу методов, эмулируя действия выводом текста в консоль. Например,
//при выполнении метода «консультировать» выводить на экран текст: «Консультант
//рассказывает о товаре».
    public Manager(String employmentDate, double salary, String presence, int department) {
        super(employmentDate, salary, presence);
        this.department = department;
    }

    public Manager() {

    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void consulting() {
        System.out.println("Менеджер рассказывает о товаре");
    }

    public void sayAboutDiscount() {
        System.out.println("Менеджер рассказывает о скидках");
    }

    public void giveAdvice() {
        System.out.println("Менеджер советует потребителям");
    }

    @Override
    double comeToWork(String presence, double salary) {
        return super.comeToWork(presence, salary);
    }

    @Override
    double toDoWork(String presence, double salary) {
        System.out.println("Менеджер отвечает за правильную организацию рабочего процесса");
        return salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return department == manager.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }
}
