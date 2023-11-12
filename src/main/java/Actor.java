import java.util.Scanner; // Для считывания с консоли
public abstract class Actor implements ActorBehavior {
    protected String name;          // Имя клиента
    protected String wish;          // Желание клиента - которое закон!
    protected boolean isMakeOrder;  // Статус готовки заказа
    protected boolean isTakeOrder;  // Статус принятия заказа клиентом
    public String GetName() {return name;} // The end of the GetName method
    public void SetName(String name) {this.name = name;} // The end of the SetName method
    @Override public boolean isMakeOrder() {return isMakeOrder;} // The end of the isMakeOrder method
    @Override public boolean isTakeOrder() {return isTakeOrder;} // The end of the isTakeOrder method
    public void SetMakeOrder(boolean makeOrder) {isMakeOrder = makeOrder;} // The end of the isMakeOrder method
    public void Wishing() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("- ");
        wish = iScanner.nextLine();
    } // The end of the Wishing method
} // The end of the Actor class
