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
			return sumI(naturalNumber);
		}
		
		switch (naturalNumber) {
			case 4: return "IV";
			case 9: return "IX";
		}

		if(naturalNumber<=8)
			return sumIfromV(naturalNumber);
		
		return null;
	}
	
	private String sumI(int natualNumber) {
		String result="";
		for(int i=1;i<=natualNumber;i++)
			result+="I";
		return result;
	}
	
	private String sumIfromV(int natualNumber) {
		String result="V";
		for(int i=6;i<=natualNumber;i++)
			result+="I";
		return result;
	}
}
