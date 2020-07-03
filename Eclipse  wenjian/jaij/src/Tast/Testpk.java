package Tast;

import java.util.Scanner;

public class Testpk {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
         double weight,height;
         int sex;
         int bmi;
         String sex1;
         String suggest;
         System.out.println("请输入你的性别(男-1 女-0):");
         sex = scan.nextInt();
         System.out.println("请输入你的(m):");
         height = scan.nextDouble();
         System.out.println("请输入你的体重(kg):");
         weight = scan.nextDouble();
         bmi = (int)(weight/height/height+0.5);
         
         if(sex==1) {
        	 sex1="男士";
        	 if(bmi<=20)
        		 suggest = "太瘦了，加强饮食！";
        	 else if(bmi<=24)
        		 suggest = "标准身材，请保持";
        	 else if(bmi<=30)
        		 suggest = "微胖，注意饮食，加强锻炼！";
        	 else if(bmi<=34)
        		 suggest = "过胖，加强锻炼，需要减肥！";
        	 else
        		 suggest = "肥胖，加强锻炼，需要节食！";
         }else {
        	 sex1="女士";
        	 if(bmi<=19)
        		 suggest = "太瘦了，加强饮食！";
        	 else if(bmi<=23)
        		 suggest = "标准身材，请保持";
        	 else if(bmi<=29)
        		 suggest = "微胖，注意饮食，加强锻炼！";
        	 else if(bmi<=33)
        		 suggest = "伪胖，加强锻炼，需要减肥!";
        	 else
        		 suggest = "肥胖，加强锻炼，需要节食！";
        	 
         }
         System.out.println(sex1+":\n您身高:"+height+"\n体重:");
         System.out.println("\n您体重质量标准值:"+bmi+"\n"+suggest);
	}

}
