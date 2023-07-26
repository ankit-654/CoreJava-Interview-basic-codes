package String;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ehgioufhiuhfvoifhofdksjoijds";
		char string []=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(string[i]==string[j] && string[i]!=' ') {
					count++;
					string[j]='0';
					// to avoid printing repeating character
				}
			}
			if(count>1 && string[i]!='0') {
				System.out.print(string[i]+ " ");
			}
		}
	}
}
