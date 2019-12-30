package ru.vyarus.dropwizard.guice.examples

import ru.vyarus.dropwizard.guice.test.spock.UseDropwizardApp
import spock.lang.Specification;

/**
 * @author Vyacheslav Rusakov
 * @since 27.01.2016
 */
@UseDropwizardApp(ManualApplication)
class ResourceTest extends Specification {

    def "Check resource call"() {

        expect: "call resource"
        new URL("http://localhost:8080/sample").getText() == "foo"
    }
}
