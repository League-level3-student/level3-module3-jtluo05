package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			if (i==0) {
				String z=s.charAt(i)+"";
				z=z.toLowerCase();
				r=r+z;
			}
			else if (i % 2 == 0) {
				r = r + s.charAt(i) + "";
			} else if (i % 2 == 1) {
				String x = s.charAt(i) + "";
				x=x.toUpperCase();
				r = r + x;
			}
		}
		return r;
	}

}
