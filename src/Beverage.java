abstract class Beverage {
    protected final Temperature temp;
    protected Beverage(Temperature temp) {
        this.temp = temp;
    }
    public abstract String serve();
}
