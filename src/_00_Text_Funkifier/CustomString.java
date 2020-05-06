package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String s) {
		String d="";
		for (int i = 0; i < s.length(); i++) {
			d=d+s.charAt(i)+" ";
		}
		return d;
	}

}
