package edu.brainacademy;

public class Main {
    public static void main(String[] args) {
        //Переопределить метод «делатьРаботу» для Менеджера, Кассира и Охранника. Внутри
        //каждого из них вывести сообщение, описывающее работу конкретного сотрудника, а
        //также вызвать другие вспомогательные методы.
        //Проверить работу магазина. Создать экземпляр класса магазин и выполнить цепочку
        //методов для демонстрации процесса работы магазина:
        //1)  Магазин открывается -> все сотрудники приходят на работу
        //2)  Магазин начинает продавать товары: клиент узнает про товары -> менеджер
        //делает «свою» работу -> клиент покупает товар -> кассир делает «свою» работу
        //-> охранник делает «свою» работу.
        //3)  Магазин закрывается на обед -> сотрудники идут на обед.
        //Для всех классов сгенерировать методы: equals, hashcode и toString
        Shop shop = new Shop();
        Client client = new Client("Silpo", 1000);
        Manager manager = new Manager("23.10.2020", 50, "At work", 1);
        Cashier cashier = new Cashier("03.12.2018",30,"At work",3);
        Bodyguard bodyguard = new Bodyguard("19.05.2019",40,"At work","Дядя Стёпа");
        shop.openUp();
        shop.sellProduct();
        System.out.println(client.knowAboutProduct());
        manager.toDoWork("At work", 50);
        System.out.println(client.buy(1000));
        cashier.toDoWork("At work", 30);
        bodyguard.toDoWork("At work", 40);
        System.out.println(shop.goToLunch());
        Human human = new Human("Umar Khalilov Kadyrovich", "0930081469");
        System.out.println(human);
    }
}
