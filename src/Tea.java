class Tea extends Beverage {
    public Tea(Temperature temp) {
        super(temp);
    }

    @Override
    public String serve() {
        return temp.description() + " tea is served!";
    }
}
