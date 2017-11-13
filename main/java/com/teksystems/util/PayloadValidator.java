package com.teksystems.util;

import com.teksystems.model.ToDo;

public class PayloadValidator {
	
	public static boolean validateCreatePayload(ToDo toDo){
		if (toDo.getId() > 0){
			return false;
		}
		return true;
	}

}
