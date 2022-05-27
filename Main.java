import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr,int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers={1,2,3,1,4,5,2,6,3,7};
        int[] dualNumbers=new int[numbers.length];
        int start=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                dualNumbers[start]=numbers[i];
                start++;
            }
        }

        int[] duplicateArray=new int[dualNumbers.length];
        int startIndex=0;
        for(int i=0;i<dualNumbers.length;i++){
            for(int j=0;j<dualNumbers.length;j++){
                if((i!=j) && dualNumbers[i]==dualNumbers[j]){
                    if(!isFind(duplicateArray,dualNumbers[i])){
                        duplicateArray[startIndex++]=dualNumbers[i];
                    }
                    break;
                }
            }
        }
        for(int value:duplicateArray){
            if(value!=0){
                System.out.print(value+" ");
            }
        }


    }
}
