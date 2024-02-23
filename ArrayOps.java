public class ArrayOps {
    public static void main(String[] args) {
      // int[] arrNew={1,3,2};
      // System.out.println(findMissingInt(arrNew));
      //int[] arrNew={1,3,7,-2,5,-4,7,-4};
      //System.out.println(secondMaxValue(arrNew));
      // int[] arrNew1={1,3,-4,5,1,1,1,1,1,1,1,1,1,1,1,1};
      // int[] arrNew2={1,3,-4,5};
      // System.out.println(containsTheSameElements(arrNew1,arrNew2));
      // int[] arrNew={5,1,1,-2};
       //System.out.println(isSorted(arrNew));
    }
    public static int findMissingInt (int [] array) {                          
        int[] arrNew=new int[array.length+1];
        for(int i=0; i < array.length; i++){        
                arrNew[array[i]]=array[i];
        }
        for(int j=1; j < arrNew.length; j++){              
            if(arrNew[j]==0) {
                return j;
            }
        }
        return 0;
    }
    public static int secondMaxValue(int [] array) {
        int max=0;
        int nextMax=0;
        for(int i=0; i < array.length; i++){        
                 if(array[i]>=max){
                    max=array[i];
                }
        }
        for(int j=0; j < array.length; j++){
            if(array[j]>nextMax && array[j]<max){
                nextMax=array[j];
            }
        }
        int count=0;
        for(int l=0; l < array.length; l++){
            if(array[l]==max){
                count++;
            }
        }
        if (count>1){
            nextMax=max;
        }
        return nextMax;
    }
    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean index=false;
        for(int i=0; i < Math.max(array1.length, array2.length); i++){ 
            index=false;
            for(int j=0; j < Math.min(array1.length, array2.length); j++){
                if(array1.length>array2.length){
                    if(array1[i]==array2[j]){
                        index=true;
                     }
                }else{
                    if(array1[j]==array2[i]){
                        index=true;
                     }
                }
                
            } 
            if (index==false) return false;       
         }
         return true;
    }
    public static boolean isSorted(int [] array) {
       int countUp=0;
       int countDown=0;
        for(int i=0; i < array.length-1; i++){
            if(array[i]<=array[i+1]){
                countUp++;
            } 
            if (array[i]>=array[i+1]) {
                countDown++;
            } 
        }
        if (countUp==array.length-1 || countDown==array.length-1){
            return true;
        } else return false;
    }

}