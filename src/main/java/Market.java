import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
public class Market implements QueueBehaviour, MarketBehaviour {
    ArrayList<Actor> guests = new ArrayList<>(); // Список посетителей
    ArrayList<Actor> actorsQueue = new ArrayList<>(); // Список очереди заказов
    ArrayList<Object> orderList = new ArrayList<>(); // Список заказов
    @Override
    public void takenGuest(Actor actor) {
        guests.add(actor);
    }
    @Override
    public void takenQueue(Actor actor) {
        actorsQueue.add(actor);
    }
    @Override
    public void takeOrders(String clientWish) {
        orderList.add(clientWish);
    }
    @Override
    public void giveOrders(Actor actor) {
        int count = 0;
        for (int i = 0; i < actorsQueue.size(); i++) {
            if (actorsQueue.get(i) == actor) {
                count = i;
            }
        }
        System.out.println("Заказа клиента " + actor.GetName() + " - " + orderList.get(count));
    }
    @Override
    public void OrderMaking(Actor actor) {
        System.out.println("- Здравствуйте, " + actor.GetName() + "! Что желаете?");
        actor.Wishing(); // Зарустили в клиенте метод выбора блюда (через ввод в консоль)
        actor.SetMakeOrder(); // Устанавливаем флаг, что выбор сделан
        System.out.println("- Ваш " + actor.wish + " готовится!");
        actor.SetTakeOrder(); // Устанавливаем флаг, что заказ готов
        orderList.add(actor.wish); // Записываем заказ клиента к список заказов
        System.out.println("- Вот ваш заказ!");
        System.out.println("-".repeat(33));
    }
    @Override
    public void releaseFromQueue(Actor actor) {
        // Удаляем из списка заказов
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i) == actor) {
                orderList.remove(i);
            }
        }
        // Удаляем из списка очереди клиентов
        for (int i = 0; i < actorsQueue.size(); i++) {
            if (actorsQueue.get(i) == actor) {
                actorsQueue.remove(i);
            }
        }
    }
} // The end of the Market class
