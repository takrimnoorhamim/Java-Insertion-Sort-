class Main {
    public static void main(String[] args) {
        
        int[] arr = {7, 8, 3, 1, 2};
        
        for (int i = 1; i < arr.length; i++){
            
            int j = i - 1;
            int temp = arr[i];
            
            while (j>=0 && temp < arr[j]){
                
                arr[j+1] = arr[j];
                j--;
                
            }
            
            // j kintu kome kome 1 bar beshi minus (-) howe gese, tai j+1
            arr[j+1] = temp;
            
        }
        
        for(int i=0; i<arr.length; i++){
            
            System.out.print(arr[i] + " ");
            
        }
        
    }
}