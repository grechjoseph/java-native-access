package com.jg.jnademo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class JnaController {

    private final JnaApiInterface jnaApiInterface = JnaApiInterface.INSTANCE;

    @GetMapping("/{string}")
    public void test(@PathVariable final String string) {
        log.info("Printing [{}] in Native Library.", string);
        jnaApiInterface.printf(string);
        log.info("Calculating cosh of 0.0.");
        final double result = jnaApiInterface.cosh(0.0);
        log.info("Result: {}", result);
    }

}
