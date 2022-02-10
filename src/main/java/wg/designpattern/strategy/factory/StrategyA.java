package wg.designpattern.strategy.factory;

import org.springframework.stereotype.Component;

@Component
public class StrategyA implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("strategy A");
    }

    @Override
    public StrategyName getName() {
        return StrategyName.A;
    }
}
