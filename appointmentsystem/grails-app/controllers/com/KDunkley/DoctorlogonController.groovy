package com.KDunkley

class DoctorlogonController {

    def index() { }
    def login(){}
    def validate(){
    	def user = Doctor.findByDoctoremail(params.email)
	if (user && user.password == params.password){
		session.user = user
		redirect(controller:'doctorhome')
	}
	else{
	flash.message = "Invalid email and password."
	render view:'index'
	}
   }
   def logout = {
	session.user = null
	redirect(uri:'index')
   }
}
