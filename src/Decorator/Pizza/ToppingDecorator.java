package Decorator.Pizza;

public abstract class ToppingDecorator extends Pizza{

    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    public abstract String getBeschreibung();
}
