package com.KDunkley

class Receptionist {
	String recepname
	String recepemail
	String recepusername
	String receppassword
	String recepphone
    static constraints = {
    	recepname size: 1..50, blank:false
	recepemail email:true, blank:false
	recepusername size: 1..50, blank:false
	receppassword size: 1..50, blank:false
	recepphone size: 1..20, blank:false
    }
   static hasOne = [surgery: Surgery]
   String toString() {
    	recepname
   }
}
