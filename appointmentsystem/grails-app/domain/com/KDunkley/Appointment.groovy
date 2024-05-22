package com.KDunkley

class Appointment {
	Date appdatetime
	Integer appduration
	String roomnumber

    static constraints = {
    	appdatetime blank: false
	appduration size: 0 ,blank: false
	roomnumber size: 1..5, blank: false
    }
    static hasOne = [surgery: Surgery, patient: Patient, doctor: Doctor]
    static hasMany = [nurse: Nurse]
    String toString() {
    	appdatetime
   }
}
