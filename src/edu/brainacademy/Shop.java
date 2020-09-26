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

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Bodyguard getBodyguard() {
        return bodyguard;
    }

    public void setBodyguard(Bodyguard bodyguard) {
        this.bodyguard = bodyguard;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void openUp(){
        System.out.println("Магазин открывается");
        System.out.println("Все сотрудники приходят на работу");
    }

    public String goToLunch(){
        System.out.println("Магазин закрывается на обед");
        return "Все сотрудники пошли на обед";
    }

    public void sellProduct(){
        System.out.println("Магазин продаёт");
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", manager=" + manager +
                ", cashier=" + cashier +
                ", bodyguard=" + bodyguard +
                ", client=" + client +
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
