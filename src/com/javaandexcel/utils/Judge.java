package com.javaandexcel.utils;

/**
 * @author wpf
 * 2016��11��17�� ����5:57:39
 */
public class Judge {
	
	public  static  int judge_city(String first, String second) {  
		  
        char[] firstByte = first.toCharArray();  
        char[] secondByte = second.toCharArray();  
        int right = 0;  
        int modelIi = 0;  
        int inputJj = 0;  
        for (int i = 0,j=0; i < firstByte.length && j < secondByte.length; i++,j++) {  
            if (firstByte[i] == secondByte[j]) {  
                right++;  
            }else{  
                for(int ti =i; ti<firstByte.length; ti++){  
                    if(firstByte[ti] == secondByte[j]){  
                        modelIi = ti;  
                        break;  
                    }else if(firstByte.length == ti+1){  
                        i--;  
                    }  
                      
                }  
                for(int tj =j; tj<secondByte.length; tj++){  
                    if(secondByte[tj] == firstByte[i]){  
                        inputJj = tj;  
                        break;  
                    }else if(secondByte.length == tj+1){  
                        inputJj = secondByte.length;  
                    }  
                }  
                if(modelIi >= inputJj){  
                        right++;  
                        j = inputJj;  
                }else if((modelIi-i) >= (inputJj-j)) {  
                    right++;  
                    j = inputJj;  
                }  
            }  
        }  
        return right;  
    }  
	
	
	


}
