
package arrays;


import java.util.Arrays;

public class ArrayOperations {


    public void Display(int[] nums){
         System.out.println("ORIGINAL ARRAY");
    for(int i = 0; i < nums.length;i++){


        System.out.println("INDEX["+i+"]"+"="+nums[i]);
    }

    }


    public void Traverse(int[] nums){
        int count=0;

        for(int i = 0; i < nums.length; i++){
        count++;

            System.out.println("INDEX["+i+"]"+"="+nums[i]);
        }
         System.out.println("THE NUMBER OF ELEMENTS IS " + count);


    }

    public String Retrieve(int [] nums , int item){
          String found,notFound;
        for(int i = 0 ; i < nums.length; i++){
        if(nums[i] == item){
        found="ITEM FOUND AT:INDEX " + i;
        return found;
        }

        }
        notFound="ITEM NOT FOUND";
        return notFound;
    }

    public void Update(int[] nums,int item, int index){
        for (int i = 0; i < nums.length; i++){
        if(i==index){
        nums[i]=item;
        }
         System.out.println("UPDATED ARRAY");
        for(int j=0; j < nums.length; j++ ){

          System.out.println("INDEX["+j+"]"+"="+nums[j]);
        }

        }
    }
    
    public void Delete(int[] nums, int pos, int size){
        
        for(int i = pos ; i < size-1;i++){
        nums[i]=nums[i+1];
        }
        size--; 
        System.out.println("ELEMNTS AFTER DELETING");
        for(int i = 0; i < size;i++){
            
        System.out.println("INDEX["+i+"]"+"="+nums[i]);
        
        }
        
    
    
    }
      public String insert(int[] nums, int item, int index) {
  
   if (index < 0 || index >nums.length) {
        return Arrays.toString(nums); 
    }

    int[] newArr = new int[nums.length + 1];

    for (int i = 0; i < index; i++) {
        newArr[i] = nums[i];
    }
    newArr[index] = item;

    for (int i = index; i < nums.length; i++) {
        newArr[i + 1] = nums[i];
    }

    return Arrays.toString(newArr);

 

    }
}



 

    
