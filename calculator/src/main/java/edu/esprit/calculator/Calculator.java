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
	public Long multiply (Long a,Long b){
		
		return a*b;
		
	}


	public Double divide(Double d1, Double d2){
		
		if(d2==0){
			throw new IllegalArgumentException("can't divide by 0 !!");
			
		}
		return d1/d2;
	}
	
	}
