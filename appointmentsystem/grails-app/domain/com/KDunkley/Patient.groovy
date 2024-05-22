package com.KDunkley

class Patient {
	String patientname
	String patientaddress
	String patientresidence
	String patientid
	Date dateregisterd
	String patientphone

    static constraints = {
    	patientname size: 1..50, blank:false
	patientaddress size: 1..100, blank:false
	patientresidence size: 1..50, blank:false
	patientid size: 1..10, blank:false
	patientphone size: 1..20, blank:false
    }
    static hasMany = [prescipition: Prescription, appointment: Appointment]
    static hasOne = [surgery: Surgery]
    String toString() {
    	patientname
   }
}
