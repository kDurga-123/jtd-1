public class ArmStrongNumber{
    public static void main(String[] args){
        int num=153;
        int number=0;
        String numStr=""+num;
        
        for(int i=0;i<numStr.length();i++){
            int armNumber=numStr.charAt(i)- '0';
            number+= java.lang.Math.pow(armNumber,numStr.length()); 
        }
        
        if(num==number){
            System.out.println("armstrong number");
        }
        else {
           System.out.println("Not a armstrong number");
        }
    }
    
 }
