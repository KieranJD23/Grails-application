package com.KDunkley

class ReceptionistlogonController {

    def index() { }
    def login(){}
    def validate(){
    	def user = Receptionist.findByRecepusername(params.username)
	if (user && user.receppassword == params.password){
		session.user = user
		redirect(controller:'receptionisthome')
	}
	else{
	flash.message = "Invalid username and password."
	render view:'index'
	}
   }
   def logout = {
	session.user = null
	redirect(uri:'index')
   }
}
