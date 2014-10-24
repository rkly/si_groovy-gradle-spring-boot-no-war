package example

import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration

import spock.lang.Specification
import configuration.Application


@WebAppConfiguration
@IntegrationTest
@ContextConfiguration(classes = Application.class, loader = SpringApplicationContextLoader.class)
class JustAnotherControlllerCT extends Specification {

    def "GET on Hello resource returns a 200OK and a non-empty body"() {
        when: def data = new URL('http://localhost:8080/').getText()
        then: data
    }

    def "GET on Info resource returns a 200OK and a non-empty body"() {
        when: def data = new URL('http://localhost:8080/info').getText()
        then: data
    }
}