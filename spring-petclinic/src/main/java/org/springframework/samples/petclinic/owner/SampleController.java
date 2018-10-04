package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.aspect.LogExecutionTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Park Sangwon
 * 2018. 7. 26.
 */
@RestController
public class SampleController {

    @Autowired
    String sangwon;

    @LogExecutionTime
    @GetMapping("/context")
    public String context() {
        return "hello " + sangwon;
    }
}
