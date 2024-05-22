package com.KDunkley

class Nurse {
	String nursename
	String qualification
	String nurseemail
	String nurseoffice
	String nursephone
    static constraints = {
    	nursename size: 1..50, blank:false
	qualification size: 1..15, blank:false
	nurseemail email:true, blank:false
	nurseoffice size: 1..10, blank:false
	nursephone size: 1..20, blank:false

    }
    static hasMany = [appointment: Appointment]
    static hasOne = [surgery: Surgery]
    String toString() {
    	nursename
   }
    
}
