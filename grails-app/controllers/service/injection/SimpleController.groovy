package service.injection

class SimpleController {

    def index() {
        render "Magic Number: ${params.magic}"
    }
}
