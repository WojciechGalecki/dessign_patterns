package wg.designpattern.strategy.component;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import wg.designpattern.strategy.component.model.Input;

@RestController
public class ProcessingController {

    private final Map<String, Processor> processorMap;

    public ProcessingController(Map<String, Processor> processorMap) {
        this.processorMap = processorMap;
    }

    @PostMapping("/component")
    public void strategy(@RequestBody Input input) {
        processorMap.get(input.process().name()).process(input.process());
    }
}
