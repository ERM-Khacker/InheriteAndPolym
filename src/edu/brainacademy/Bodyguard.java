package edu.brainacademy;

import java.util.Objects;

public class Bodyguard extends Co_worker {
    protected String nameOfBodyguard;

    public Bodyguard(String employmentDate, double salary, String presence, String nameOfBodyguard) {
        super(employmentDate, salary, presence);
        this.nameOfBodyguard = nameOfBodyguard;
    }

    public Bodyguard() {
    }

    String talkOnTheRadio(String nameOfBodyguard) {
        this.nameOfBodyguard = nameOfBodyguard;
        return "Охранник " + nameOfBodyguard + " " + "говорит по рации";
    }

    @Override
    double comeToWork(String presence, double salary) {
        return super.comeToWork(presence, salary);
    }

    @Override
    double toDoWork(String presence, double salary) {
        System.out.println("Охранник следит за порядком в магазине, отвечает за безопасность сотрудников" +
                " и имущество");
        return salary;
    }

    @Override
    public String toString() {
        return "Bodyguard{" +
                "nameOfBodyguard='" + nameOfBodyguard + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bodyguard bodyguard = (Bodyguard) o;
        return nameOfBodyguard.equals(bodyguard.nameOfBodyguard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfBodyguard);
    }
}
