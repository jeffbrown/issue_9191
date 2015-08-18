package service.injection

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(SimpleController)
@Mock(SimpleFilters)
class SimpleFiltersSpec extends Specification {

    static doWithSpring = {
        simpleService simple.injection.SimpleService
    }

    void "test filter injection"() {
        when:
        withFilters(controller:"simple" , action:"index"){
            controller.index()
        }

        then:
        response.text == 'Magic Number: 42'
    }
}
