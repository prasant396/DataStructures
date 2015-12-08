public class Interview1{
	static StringBuffer s = new StringBuffer("   position      1 no.    @ durga    is This");
											//0123456789
	public static void main(String[] args){
		System.out.println("Original String : " + s);
		// w >>> starting position of the string
		// j >>> ending position of the string
		int i = 0,j = 0,w = 0;
		while (i < s.length()){
			if (i == 0){
				w = 0;
			}
			if (((s.charAt(i) == ' ') || (i == s.length()-1))){
				j = i;
				if (i == s.length()-1)
					j = i;
				else
					j--;
				swap(w,j);
				w = i + 1;
			}//if
			i++;
		}//while (i < s.length())
		swap(0, s.length()-1);
		String a = s.toString();
		a = a.trim();
		a = a.replaceAll("//s","");
		System.out.println("Reverse String : " + a);
	}//main
	static void swap(int i, int j){
		while(i < j){
			char ch = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, ch);
			i++;
			j--;
		}//while
	}//swap
}//Interview1
