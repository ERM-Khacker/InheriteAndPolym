package edu.brainacademy;

import java.util.Objects;

// Создать класс «Магазин» с композицией из ранее созданных классов.
public class Shop {
    private String name;
    private String address;
    private Manager manager;
    private Cashier cashier;
    private Bodyguard bodyguard;
    private Client client;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
        openUp();
        sellProduct();
        goToLunch();
    }

    public void openUp() {
        System.out.println("Магазин открывается");
        System.out.println("Все сотрудники приходят на работу");
        Manager manager = new Manager("10.12.1999", 50, "At work", 2);
        Cashier cashier = new Cashier("20.09.2010", 40, "At work", 3);
        Bodyguard bodyguard = new Bodyguard("22.11.2020", 30, "At work", "Васёк");
        System.out.println(manager.comeToWork("At work", 50) + " " + manager);
        System.out.println(cashier.comeToWork("At work", 40) + " " + cashier);
        System.out.println(bodyguard.comeToWork("At work", 30) + " " + bodyguard);
    }

    public void sellProduct() {
        System.out.println("Магазин начинает продавать товары");
        Client client = new Client("Silpo", 1000);
        Manager manager = new Manager();
        Cashier cashier = new Cashier();
        Bodyguard bodyguard = new Bodyguard();
        System.out.println(client.knowAboutProduct());
        manager.toDoWork("At work", 50);
        manager.consulting();
        manager.sayAboutDiscount();
        manager.giveAdvice();
        client.buy(1200.25);
        cashier.toDoWork("At work", 40);
        cashier.countOfMoney();
        bodyguard.toDoWork("At work", 30);
        System.out.println(bodyguard.talkOnTheRadio("Васёк"));
    }

    public void goToLunch() {
        System.out.println("Магазин закрывается на обед. Все сотрудники пошли на обед");
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) &&
                Objects.equals(address, shop.address) &&
                Objects.equals(manager, shop.manager) &&
                Objects.equals(cashier, shop.cashier) &&
                Objects.equals(bodyguard, shop.bodyguard) &&
                Objects.equals(client, shop.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, manager, cashier, bodyguard, client);
    }

}
