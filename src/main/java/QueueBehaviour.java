public interface QueueBehaviour {
    void takenGuest(Actor actor);
    void takenQueue(Actor actor);
    void takeOrders(String clientWish);
    void giveOrders(Actor actor);
    void releaseFromQueue(Actor actor);
} // The end of the QueueBehaviour interface
