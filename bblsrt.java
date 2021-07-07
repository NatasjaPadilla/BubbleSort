/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbles;
import java.util.Random;
/**
 *
 * @author tea
 */
public class bblsrt {
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Random rnd = new Random();
        int[] nums = new int[10];
        int temp = 0;
        boolean sorted;
        
        for(int x = 0; x < nums.length; x++)
        {
            nums[x] = rnd.nextInt(50); //generates the numbers
            System.out.print(nums[x] + "\t"); //prints the numbers
        }
        System.out.println();
        
        //this is the sorting algorithm
        for(int x = 0; x < nums.length; x++)
        {	
        	sorted = true; //reset
            for(int y = 0; y < nums.length - 1; y++)
            {
                if(nums[y] > nums[y+1])
                {
                    temp = nums[y];
                    nums[y] = nums[y+1];
                    nums[y+1] = temp;
                    sorted = false; //sets a new value
                }
     
              
            }
            
            System.out.print("Pass #" + (x+1) + ": \t");
            for(int z = 0; z < nums.length; z++)
            {
                System.out.print(nums[z] + "\t");
            }
            System.out.println();
            
            if(sorted)
            {
            	break;
            }
        }
     
        
	}
    
}
