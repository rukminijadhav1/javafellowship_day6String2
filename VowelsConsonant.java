package day6Assignment.StringPrograms;



public class VowelsConsonant {
	
	void string(String str) {
		int vcount = 0;
		int ccount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vcount++;
			} else if (str.charAt(i) >= 'a' || str.charAt(i) <= 'z') {
				ccount++;
			}
		}
		System.out.println(vcount + " " + ccount);

	}

	public static void main(String[] args) {
		
	
		VowelsConsonant vc = new VowelsConsonant();
		vc.string("pooja kishor jadhavu");

	}

}
