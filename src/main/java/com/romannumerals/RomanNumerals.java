package com.romannumerals;

public class RomanNumerals {

	public String convert2romans(int naturalNumber) {
		/*if(naturalNumber==1)
		return "I";
		
		if(naturalNumber==2)
			return "II";
			
		return "III";*/
		/*
		 * 
		switch (naturalNumber) {
			case 1: return "I";
			case 2: return "II";
			case 3: return "III";
			case 4: return "IV";
		}*/
		
		/*
		if(naturalNumber<4){
			return sumI(naturalNumber);
		}
		
		switch (naturalNumber) {
			case 4: return "IV";
			case 5: return "V";
			case 6: return "VI";
			case 7: return "VII";
			case 8: return "VIII";
			case 9: return "IX";
		}*/
		
		if(naturalNumber<=3){
			return sumI(1,naturalNumber,"");
		}
		
		switch (naturalNumber) {
			case 4: return "IV";
			case 9: return "IX";
		}

		if(naturalNumber<=8)
			return sumI(6,naturalNumber,"V");
		
		return null;
	}
	
	private String sumI(int init, int natualNumber, String symbol) {
		for(int i=init;i<=natualNumber;i++)
			symbol+="I";
		return symbol;
	}
}
