public class Main {
    public static void main(String[] args) {
        Market market = new Market(); // Создали рынок-магазин-кафе
        System.out.println("МЫ ОКРЫЛИСЬ! ДОБРО ПОЖАЛОВАТЬ!");
        // Заходят трое человек по очереди
        Actor actor1 = new Human(); // Создали человека, потенциального покупателя (актора), но пока просто гость
        Actor actor2 = new Human(); // Создали человека, потенциального покупателя (актора), но пока просто гость
        Actor actor3 = new Human(); // Создали человека, потенциального покупателя (актора), но пока просто гость
        Actor actor4 = new Human(); // Создали человека, потенциального покупателя (актора), но пока просто гость
        // Идентифицируем их (можно просто номерами, выбрал именами)
        actor1.SetName("Irina"); // Установили гостю имя
        actor2.SetName("Felix"); // Установили гостю имя
        actor3.SetName("Maxim"); // Установили гостю имя
        actor4.SetName("Janna"); // Установили гостю имя
        // Формируем список посетителей (не покупателей)
        market.takenGuest(actor1); // Добавили человека в список гостей (не покупателей)
        market.takenGuest(actor2); // Добавили человека в список гостей (не покупателей)
        market.takenGuest(actor3); // Добавили человека в список гостей (не покупателей)
        market.takenGuest(actor4); // Добавили человека в список гостей (не покупателей)
        // Покупатели походили, посмотрели вкусняшки и становятся в очередь (решают завтракать тут)
        market.takenQueue(actor1); // Гость становится в очередь
        market.takenQueue(actor2); // Гость становится в очередь
        market.takenQueue(actor3); // Гость становится в очередь
        // Гости делают заказы в порядке очереди
        for (int i = 0; i < market.actorsQueue.size(); i++) {
            market.OrderMaking(market.actorsQueue.get(i)); // Запускаем процесс обработки заказа магазином, когда очередь дошла
        }
        // Завершение рабочего дня
        System.out.println(market.guests); // Вывели список гостей
        System.out.println(market.actorsQueue); // Вывели список клиентов
        System.out.println(market.orderList);   // Вывели список заказов
        market.releaseFromQueue(actor2); // Удаляем клиента из списка клиентов
        System.out.println(market.actorsQueue); // Вывели список клиентов снова
        System.out.println("МЫ ЗАКРЫЛИСЬ! СЧАСТЛИВОГО ВЕЧЕРА!");
    } // The end of the main method
} // The end of the Main class
