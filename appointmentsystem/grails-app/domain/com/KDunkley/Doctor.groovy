package com.KDunkley

class Doctor {
	String doctorname
	String qulification
	String position
	String doctoremail
	String password
	String doctorsoffice
	String doctorsphone
	String bio
    static constraints = {
    	doctorname size: 1..50, blank:false
	qulification size: 1..50, blank:false
	position size: 2..10, blank:false
	doctoremail email:true, blank:false
	password size: 1..50, blank:false
	doctorsoffice size: 1..50, blank:false
	doctorsphone size: 1..20, blank:false
	bio size: 50..500, blank:false
    }
    static hasMany = [prescipition: Prescription, appointment: Appointment]
    static hasOne = [surgery: Surgery]
    String toString() {
    	doctorname
   }
}
