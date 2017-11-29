package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	String onesArray[] = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
	String tensArray[] = { "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
	String hundredsArray[] = { "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
	String thousandsArray[] = { "M", "MM", "MMM" };

	public String convert(int i) {

		int ones = i % 10;

		i = (i - ones) / 10;
		int tens = i % 10;

		i = (i - tens) / 10;
		int hundreds = i % 10;

		i = (i - hundreds) / 10;
		int thousands = i % 10;

		if ((thousands >= 1) && (hundreds >= 1) && (tens >= 1) && (ones >= 1)) {
			return thousandsArray[thousands - 1] + hundredsArray[hundreds - 1] + tensArray[tens - 1]
					+ onesArray[ones - 1];
		}
		if ((thousands >= 1) && (hundreds >= 1) && (tens >= 1)) {
			return thousandsArray[thousands - 1] + hundredsArray[hundreds - 1] + tensArray[tens - 1];
		}
		if ((thousands >= 1) && (hundreds >= 1) && (ones >= 1)) {
			return thousandsArray[thousands - 1] + hundredsArray[hundreds - 1] + onesArray[tens - 1];
		}
		if ((thousands >= 1) && (tens >= 1) && (ones >= 1)) {
			return thousandsArray[thousands - 1] + tensArray[tens - 1] + onesArray[ones - 1];
		}
		if ((thousands >= 1) && (ones >= 1)) {
			return thousandsArray[thousands - 1] + onesArray[ones - 1];
		}
		if (thousands >= 1) {
			return thousandsArray[thousands - 1];
		}
		if ((hundreds >= 1) && (tens >= 1) && (ones >= 1)) {
			return hundredsArray[hundreds - 1] + tensArray[tens - 1] + onesArray[ones - 1];
		}
		if ((hundreds >= 1) && (tens >= 1)) {
			return hundredsArray[hundreds - 1] + tensArray[tens - 1];
		}

		if ((hundreds >= 1) && (ones >= 1)) {
			return hundredsArray[hundreds - 1] + onesArray[ones - 1];
		}

		if (hundreds >= 1) {
			return hundredsArray[hundreds - 1];
		}
		if ((tens >= 1) && (ones >= 1)) {
			return tensArray[tens - 1] + onesArray[ones - 1];
		}
		if (tens >= 1) {
			return tensArray[tens - 1];
		}

		return onesArray[ones - 1];

	}

}