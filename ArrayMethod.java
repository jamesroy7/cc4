
package arrays;
import java.util.Scanner;
public class ArrayMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayOperations operations = new ArrayOperations();

        int[] nums;
        int size;
       
      
        do{
        System.out.println("MAXIMUM OF 10");
        System.out.println("ARRAY SIZE:");
        size=sc.nextInt();
        }while((size > 10)); 






        nums = new int[size];

        System.out.println("ENTER THE ELEMENTS:");

        for(int i =0; i< nums.length; i++){
        nums[i]=sc.nextInt();
        }
            System.out.println("ELEMENTS STORED");




      
        System.out.println("ARRAY OPERATIONS");
        System.out.println("[1]TRAVERSE\n[2]RETRIEVE\n[3]UPDATE\n[4]DELETE\n[5]INSERT");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
                operations.Traverse(nums);
            break;
            case 2:
                System.out.println("ITEM YOU WANT TO RETRIEVE:");
                int item=sc.nextInt();
                System.out.println( operations.Retrieve(nums, item));

            break;
            case 3:
                operations.Display(nums);
                System.out.println("INDEX YOU WANT TO UPDATE:");
                int index=sc.nextInt();
                System.out.println("ITEM:");
                int Updateditem=sc.nextInt();
                operations.Update(nums, Updateditem, index);

            break; 
            case 4:
                operations.Display(nums);
                System.out.println("INDEX YOU WANT TO DELETE:");
                int deletedIndex=sc.nextInt();
                operations.Delete(nums, deletedIndex, size);
            break;
            case 5:
                 operations.Display(nums);
                 System.out.println("INDEX YOU WANT TO INSERT:");
                 int insertedIndex=sc.nextInt();
                 System.out.println("ITEM:");
                 int insertedItem=sc.nextInt();
                 System.out.println( operations.insert(nums, insertedItem, insertedIndex)); 
            break;
            default:
                System.out.println("INVALID OPERATIONS");
            break;
            
        }
      
        
  
                
        
 }
  }
        




    


