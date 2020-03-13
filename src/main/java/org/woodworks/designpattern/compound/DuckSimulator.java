package org.woodworks.designpattern.compound;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        AbstractDuckFactory factory = new CounterDuckFactory();
        Quackable redheadDuck = factory.createRedHeadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Goose goose =new Goose();
        GooseDuckAdapter adapter = new GooseDuckAdapter(goose);
        QuackCounter quackCounter = new QuackCounter(adapter);

        Flock flock = new Flock();
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(quackCounter);

        Flock flock2 = new Flock();
        flock2.add(factory.createMallardDuck());
        flock2.add(factory.createMallardDuck());
        flock2.add(factory.createMallardDuck());
        flock2.add(factory.createMallardDuck());

        flock.add(flock2);

        Observer observer = new Quakologist();
        flock.registerObserver(observer);

        flock2.registerObserver(observer);

        simulate(flock);
        simulate(flock2);

        System.out.println(quackCounter.getCounter());
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
