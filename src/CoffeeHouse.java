public class CoffeeHouse {
    public static void main(String[] args) {
        Beverage hotCoffee = new Coffee(new Hot());
        Beverage coldTea = new Tea(new Cold());

        System.out.println(hotCoffee.serve());
        System.out.println(coldTea.serve());
    }
}
