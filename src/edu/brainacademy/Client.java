package edu.brainacademy;

import java.util.Objects;

public class Client {
    private String discountCard;
    private double amountOfMoney; //Кол-во денег

    public Client(String discountCard, double amountOfMoney) {
        this.discountCard = discountCard;
        this.amountOfMoney = amountOfMoney;
    }

    public String getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(String discountCard) {
        this.discountCard = discountCard;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    String knowAboutProduct() {
        return "Клиент узнаёт про товары";
    }

    double buy(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
        System.out.println("Клиент покупает товары");
        double pay = 0;
        return amountOfMoney - pay;
    }


    @Override
    public String toString() {
        return "Client{" +
                "discountCard='" + discountCard + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Double.compare(client.amountOfMoney, amountOfMoney) == 0 &&
                discountCard.equals(client.discountCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountCard, amountOfMoney);
    }
}
