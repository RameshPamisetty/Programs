package com.programs;

//subarray with given sum
public class Lab15 {

	public static void main(String[] args) {
		String input = "yyyybbbbdexxxxxxx";
		String encodedString = runLengthEncode(input);
		System.out.println(encodedString);
	}

	private static String runLengthEncode(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}
		String result = "";
		int count = 1;
		int len=input.length();

		for (int i = 1; i < len; i++) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				result += input.charAt(i - 1) + "" + count;
				count = 1;
			}
		}

		result += input.charAt(len - 1) + "" + count;
		return result;
	}
}
