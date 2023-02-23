public class RecusiveArray {

    public static int findMin(int[] arr, int front, int back){
        if(front == back){
            return arr[front];
        }
        else{
            if(arr[front]<arr[back]){
                return findMin(arr, front, back-1);
            }
            else{
                return findMin(arr, front+1, back);
            }
        }
    }

    public static void main(String[] args){
        int[] myArr = {4,6,3,4,7,1};
        System.out.println(findMin(myArr, 0, myArr.length -1));
    }
    
}
