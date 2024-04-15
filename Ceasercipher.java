package isinternallab;
import java.util.Scanner;
public class Ceasercipher {
	static String encode(String msg,int offset)
	{
		offset = offset%26+26;
		StringBuilder encode = new StringBuilder();
		for(char i:msg.toCharArray())
		{
			if(Character.isUpperCase(i))
			{
				encode.append((char)('A'+(i+'A'+offset)%26));
				
			}
			else if(Character.isLowerCase(i))
			{
				encode.append((char)('a'+(i+'a'+offset)%26));
			}
			else
				encode.append((char)i);
		}
		return encode.toString();
		
		
	}
	static String decode(String msg,int offset)
	{
		return encode(msg,26+offset);
	}
	public static void main(String args[])
	{
		String msg = "jagginei gani ganesh jaggineni ganesh";
		
		System.out.println("Ceaser Cipher ");
//		String encrypted = encode(msg,3);
		String encrypted = "cxknxawxccxkncqjcrbcqnzdnbcrxwfruurjvbqjtnbynjan";
		
		String decrypted = decode(encrypted,5);
		System.out.println("encrypted message : "+encrypted);
		System.out.println("decrypted message : "+decrypted);
		
		
		
	}

}
