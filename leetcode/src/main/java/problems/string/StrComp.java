package problems.string;

import java.util.Arrays;

/**
 * @author amruta.kajrekar
 */
public class StrComp {

	public static void main(String[] args) {
		StrComp comp = new StrComp();
		char[] viraj = //{'a','b','c'};
//			{'a','a','b','b','c','c','c'};
//			{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//		{'a','a','a','a','a','a','b'};
			{'a','a','a','b','b','a','a'};
		System.out.println(comp.compress3(viraj));
//		System.out.println(c);
	}
	
	public int compress4(char[] chars){
		
		
		return chars.length;
	}
	
	
	public int compress3(char[] chars) {
		   int count=1;
			for(int i=0;i<chars.length-1;){
				for(int j=i+1;j<chars.length;j++){
					 if(chars[i]!= chars[j]){
						 	if(count>1)
			            	chars[i+1]=(char)(count+48);
			            	if(j!=chars.length)
			            	{count=1;i=j;}
			            }else{
			            	count++;
			            	chars[j]=0;
			            }
				}
		
				//if 2 digits=>>
				if(count>9){
					 char[] b = (""+count).toCharArray();
					 for(int k=0;k<b.length;k++){
						 chars[i+1]=(char)(Character.getNumericValue(b[k])+48);
						 i++;
					 }
				}else if(count>1){
					chars[i+1]=(char)(count+48);
				}
				char[] cs= new char[chars.length];
				int index=0;
				for (char c : chars) {
					if(c!=0){
						cs[index]=c;
						index++;
					}
					
				}
				chars=cs;
				int j=i;
				if((chars.length>i+2)&&(chars[j]>='a' || chars[j]>='A') && (chars[j]<='z' || chars[j]<='Z')){
					j=i+2;
				 chars=Arrays.copyOfRange(chars, 0, j);
				}else{
					j=i+1;
					chars=Arrays.copyOfRange(chars, 0, j);
				}
				index=0;
				for (char c : chars) {
					if(c!=0){
						index++;
					}
					else{
						break;
					}
				}
				chars=Arrays.copyOfRange(chars, 0, index);
				System.out.println(chars);
				break;
			}
			return chars.length;
	    }
	
	
	public int compress2(char[] chars) {
		StringBuilder str= new StringBuilder();
        int count=1;
        int i=0;
        for(; i<chars.length-1; i++){
            if(chars[i]!= chars[i+1]){
            	str.append(chars[i]).append(count);
            	count=1;
            }else{
            	count++;
            }
        }
        str.append(chars[i]).append(count);
        System.out.println(str);
        chars = new char[str.length()];
        for (i=0; i<chars.length;i++) {
			chars[i]=str.charAt(i);
		}
		return chars.length;
	}
}
