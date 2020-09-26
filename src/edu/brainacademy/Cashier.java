package edu.brainacademy;

import java.util.Objects;

public class Cashier extends Co_worker {
    private int numberCashBox;

    public Cashier(String employmentDate, double salary, String presence, int numberCashBox) {
        super(employmentDate, salary, presence);
        this.numberCashBox = numberCashBox;
    }

    public int getNumberCashBox() {
        return numberCashBox;
    }

    public void setNumberCashBox(int numberCashBox) {
        this.numberCashBox = numberCashBox;
    }
    void countOfMoney(){
        System.out.println("Кассир считает деньги");
    }

    @Override
    double toDoWork(String presence, double salary) {
        System.out.println("Работа кассира заключается в обслуживании клиентов за кассой и в правильном " +
                "подсчитывании денег");
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return numberCashBox == cashier.numberCashBox;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberCashBox);
    }
}
