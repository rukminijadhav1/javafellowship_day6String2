package day6Assignment.StringPrograms;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		String str = "Brag";
		String str2 = "grab";
		str = str.toLowerCase();
		str2 = str2.toLowerCase();
		if (str.length() != str2.length()) {
			System.out.println("Both string are not anagram");
		} else {
			char[] str1 = str.toCharArray();
			char[] str3 = str2.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str3);
			if (Arrays.equals(str1, str3) == true) {
				System.out.println("Both the strings are anagram");

			}
			else
			{
				System.out.println("both Strings are not anagram");
			}

		}
	}
}
