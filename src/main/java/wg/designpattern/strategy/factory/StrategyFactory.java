package wg.designpattern.strategy.factory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StrategyFactory {

    private Map<StrategyName, Strategy> strategies;

    @Autowired
    public StrategyFactory(Set<Strategy> strategySet) {
        createStrategy(strategySet);
    }

    public Strategy getStrategy(StrategyName name) {
        return strategies.get(name);
    }

    private void createStrategy(Set<Strategy> strategySet) {
        System.out.println("creating strategies from: ");
        strategies = new HashMap<>();
        strategySet.forEach(
            strategy -> {
                System.out.println("strategy: " + strategy.getName());
                strategies.put(strategy.getName(), strategy);
            });
    }
}
