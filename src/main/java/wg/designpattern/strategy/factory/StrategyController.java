package wg.designpattern.strategy.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrategyController {

    @Autowired
    private StrategyFactory strategyFactory;

    @GetMapping("/factory/{name}")
    public void strategy(@PathVariable StrategyName name) {
        Strategy strategy = strategyFactory.getStrategy(name);

        strategy.doSomething();
    }
}
