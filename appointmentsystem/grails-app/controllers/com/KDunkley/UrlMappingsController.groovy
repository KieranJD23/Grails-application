package com.KDunkley

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{  
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"logonhome")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
