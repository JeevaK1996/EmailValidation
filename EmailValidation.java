# EmailValidation
import java.util.Scanner;

/*
 * Email Validation String input1="test@mail.com" 1)@ & : should be present; 
 * 2)@ & . should not be repeated; 3)there should be four characters between @ and .;
 *  4)there should be at-least 3 characters before @ ; 5)the end of mail id should be .com; - 
 */
public class EmailValidation {
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		String s1="",s2="",s3="",s4="",s5="";
		int count=0;
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
			{
			if((c[i]=='@')){
			count++;
			}
			}
		if(count==1){
			s1="valid";
		}else{
			s1="invalid";
		}
		String str[]=s.split("@");
		int len=str[1].length();
		if(len==8){
			s2="valid";
		}else{
			s2="invalid";
		}
		String ss=str[1].substring(0, str[1].length()-4);
	//	System.out.println(ss);
		if(ss.length()==4){
			s3="valid";
		}else{
			s3="invalid";
		}
		String com=str[1].substring(ss.length()+1, str[1].length());
		if(com.equals("com")){
			s4="valid";
		}else{
			s4="invalid";
		}
		//System.out.println(s1+" "+s2+" "+s3+" "+s4);
		if(s1=="valid"&&s2=="valid"&&s3=="valid"&&s4=="valid"){
			System.out.println("Valid Email");
		}else{
			System.out.println("Invalid Email");
		}
		
	}
}
