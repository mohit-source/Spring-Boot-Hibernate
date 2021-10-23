package com.example.hibernateExercise2.app;

import com.example.hibernateExercise2.dao.PhoneDao;
import com.example.hibernateExercise2.entity.Phone;
import com.example.hibernateExercise2.entity.PhoneDetails;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Phone phone = new Phone();
//			phone.setNumber("8668519500");
//			
//			PhoneDetails details = new PhoneDetails();
//			details.setProvider("Airtel");
//			details.setTechnology("4G");
//			
//			phone.setDetails(details);
//			 
			PhoneDao phoneDao = new PhoneDao();
//			
//			phoneDao.savePhone(phone);
			
			phone = phoneDao.getPhone(2L);
			System.out.println(phone.toString());
		
	}
	
	

}
