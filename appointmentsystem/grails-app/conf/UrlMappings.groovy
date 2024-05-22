class UrlMappings {

    static mappings = {

        "/$controller/$action?/$id?"{
            constraints {
                // apply constraints here
            }
        }

        //"/"(view:"/index")
        "/" ( controller:'Appointment', view:'index', action:'index' ) // Here i have changed the desired   action to show the desired page while running the application
        "500"(view:'/error')
    }
}
