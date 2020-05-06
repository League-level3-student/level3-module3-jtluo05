package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String right = "";
		for (int i = 0; i < s.length(); i++) {
right=right+s.charAt(s.length()-1-i)+"";

		}
		return right;
	}

}
