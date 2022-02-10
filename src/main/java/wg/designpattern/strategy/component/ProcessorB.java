package wg.designpattern.strategy.component;

import org.springframework.stereotype.Component;

import wg.designpattern.strategy.component.model.Process;

@Component("B")
public class ProcessorB implements Processor {
    @Override
    public void process(Process process) {
        System.out.println("ProcessorB with process: " + process);
    }
}
