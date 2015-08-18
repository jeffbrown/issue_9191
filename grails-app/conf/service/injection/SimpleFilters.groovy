package service.injection

class SimpleFilters {

    def simpleService

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                params.magic = simpleService.magicNumber
                true
            }
        }
    }
}
