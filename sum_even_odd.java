public class sum_even_odd {
    public static void main(String[] args){
        int arr [] ={ 5 ,2 ,7,8,9,4,6,3,1,10};
        int sum_even  = 0 ;
        int sum_odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum_even += arr[i];
            } else {
                sum_odd += arr[i];
            }
        }
        System.out.println("Sum of even numbers: " + sum_even);
        System.out.println("Sum of odd numbers: " + sum_odd);
        System.out.println("Total sum: " + (sum_even + sum_odd));
    }
    
}
