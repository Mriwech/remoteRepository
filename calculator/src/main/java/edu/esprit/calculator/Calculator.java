package edu.esprit.calculator;

public class Calculator {

	//public Long add(Long a, long b){
		//return a+b; 
	public Long add(Long... args){
		long result = 0l;
		for(Long arg : args){
			result +=arg;
			}
		return result;
		}

	
		
	}