package com.KDunkley

class Surgery {
	String name
	String address
	String postcode
	String telephone
	Integer numberofpatients
	String discription
	String openingtime
	Boolean registeringnewpatients
    static constraints = {
    	name size: 1..50, blank:false
    	address size: 10..100, blank:false
    	postcode size: 5..10, blank:false
    	numberofpatients min:1
    	discription size: 50..500
    	registeringnewpatients blank:false
    }
    static hasMany = [appointment: Appointment, doctor: Doctor, nurse: Nurse, patient: Patient, receptionist: Receptionist]
    String toString() {
    	name
   }
}
