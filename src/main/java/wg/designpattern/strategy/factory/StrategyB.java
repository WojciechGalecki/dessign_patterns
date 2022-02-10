package wg.designpattern.strategy.factory;

import org.springframework.stereotype.Component;

@Component
public class StrategyB implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("strategy B");
    }

    @Override
    public StrategyName getName() {
        return StrategyName.B;
    }
}
