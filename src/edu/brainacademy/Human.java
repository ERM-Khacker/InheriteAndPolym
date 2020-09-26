package edu.brainacademy;

import java.util.Objects;

public class Human {
    private String fullName;
    private String BD; // дата рождения
    private String numberPhone;
// Создать конструктор для класса «Человек», в который передать поля «фио» и «номер
//телефона». Решить проблемы с конструкторами в дочерних классах
    public Human(String fullName, String numberPhone) {
        this.fullName = fullName;
        this.numberPhone = numberPhone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBD() {
        return BD;
    }

    public void setBD(String BD) {
        this.BD = BD;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
    void sayHello(){
        System.out.println("Hello");
    }
    void sayBuy(){
        System.out.println("Goodbye");
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", BD=" + BD +
                ", numberPhone=" + numberPhone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return fullName.equals(human.fullName) &&
                BD.equals(human.BD) &&
                numberPhone.equals(human.numberPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, BD, numberPhone);
    }
}
