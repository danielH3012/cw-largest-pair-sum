public class Solution{
    public static int largestPairSum(int[] numbers){
        // your code here
      int [] array = numbers;
      int num = array.length;
      int temp = 0;
      
    for (int i = 0; i < ( num - 1 ); i++) {
      for (int j = 0; j < num - i - 1; j++) {
        if (array[j] < array[j+1]) 
        {
          temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
      
        return array[0] + array[1];
    }
}
