interface CoffeMachine{
    void prepareCoffee();
}

abstract class BaseCoffee implements CoffeMachine{
    public void prepareCoffee(){
        System.out.println("150ml wody,50ml mleka, 2 porcje kawy, 3lyzki cukru");
    }
}
class EspressoCoffee extends BaseCoffee implements CoffeMachine{
    public void prepareCoffee(){
        System.out.println("Przygotowano Espresso: 50 ml wody, 1 porcja kawy");
    }
}
class LatteCoffee extends BaseCoffee implements CoffeMachine{
    public void prepareCoffee(){
        System.out.println("Przygotowano Latte: 50 ml wody,50ml mleka, 3lyzki cukrum 1 porcja kawy ");
    }
}
class CappuccinoCoffee extends BaseCoffee implements CoffeMachine{
    public void prepareCoffee(){
        System.out.println("Przygotowano Cappuccino: 50ml wody, 25ml mleka, 1lyzka cukru, 1porcja kawy");
    }
}






public class Main {
    public static void main(String[] args) {
        BaseCoffee coffee = new EspressoCoffee();
        coffee.prepareCoffee();
        EspressoCoffee espresso = new EspressoCoffee();
        espresso.prepareCoffee();
        LatteCoffee latte = new LatteCoffee();
        latte.prepareCoffee();
        CappuccinoCoffee cappuccino = new CappuccinoCoffee();
        cappuccino.prepareCoffee();

    }
}