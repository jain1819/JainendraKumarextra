package com.gl.dsaLab1010.function;
/*This class is for separating brackets from a string containing letters,symbols and other symbols
*ex. input--->9+(8*9)-{u/t}+[8/2],[43*2+{98+(60/2)}]
*   output---> (){}[]			 ,[{()}]
*/
public class BracketSeparation {
	
	public static String Separation(String brackets){
		int l=brackets.length();
		char brstring[]=new char[l];
		char br[]=new char[l];
		int p=0;
		
		for (int i = 0; i < l; i++)
			br[i] = brackets.charAt(i);

	for (int k=0;k<l;k++) {
		if (br[k] == '(' || br[k] == ')' || br[k] == '{' || br[k] == '}' || br[k] == '[' || br[k] == ']') {
			brstring[p] = br[k];
			p++;
		}
	}
	String str=String.valueOf(brstring);
	System.out.println("Separated string containing brackets"+str);
return str;
	}
}
