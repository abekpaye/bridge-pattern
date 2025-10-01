class Coffee extends Beverage {
    public Coffee(Temperature temp) {
        super(temp);
    }
    @Override
    public String serve() {
        return temp.description() + " coffee is served!";
    }
}
