package com.example;

/**
 * Created by jp on 22/07/18.
 */

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/resources"},
        format = { "pretty", "json:target/cucumber.json" }
)
public class CukesRunner {
}
