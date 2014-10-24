package example

import hello.HelloController;
import spock.lang.Specification

class HelloControllerTest extends Specification {

    HelloController helloController = new HelloController()

    def "Return a greeting when called"() {
        when: def greeting = helloController.index()
        then:
        greeting
    }
}
