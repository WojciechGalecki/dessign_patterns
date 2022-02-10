package wg.designpattern.strategy.component;

import org.springframework.stereotype.Component;

import wg.designpattern.strategy.component.model.Process;

@Component("A")
public class ProcessorA implements Processor {

    @Override
    public void process(Process process) {
        System.out.println("ProcessorA with process: " + process);
    }
}
