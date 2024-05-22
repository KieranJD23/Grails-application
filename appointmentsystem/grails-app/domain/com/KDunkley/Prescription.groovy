package com.KDunkley

class Prescription {
	Integer prescriptionnumber
	String medicine
	Integer dayssuply
	Integer totalcost
	Date dateissued
	Boolean patientpaying
    static constraints = {
    	prescriptionnumber maxSize: 100, blank: false
    	medicine maxSize: 100, blank: false
    	dayssuply range:1..100, blank: false
    	totalcost maxSize: 100, blank: false
    	dateissued maxSize: 100, blank: false
    	patientpaying blank: false
    }
    static hasOne = [doctor: Doctor, patient:Patient]
    String toString() {
    	prescriptionnumber
   }
}
