package stratégie;

public class Test { 

	 


	public static void main(String args[]) throws InterruptedException { 

         Produit a = new Produit("aa",2);
         Produit b = new Produit("bb",2);
         Produit c = new Produit("cc",2);
         Produit d = new Produit("dd",2);
         

        // we can provide any strategy to do the sorting  

        Produit[] array = {d,b,a,c};    /*{5,4,7,6};*/ 
        
        Produit[] array1 = {d,b,a,c};
        
        Produit[] array2 = {d,b,a,c};
        
        Produit[] array3 = {d,b,a,c};

        Context ctx = new Context(new BubbleSort()); 

        ctx.arrange(array); 

         

        // we can change the strategy without changing Context class 

        ctx = new Context(new QuickSort()); 

        ctx.arrange(array1); 
        
        
        
        ctx = new Context(new InsertionSort()); 

        ctx.arrange(array2);
        
        
        ctx = new Context(new MergeSort()); 

        ctx.arrange(array3);
        
        int i;
        for (i=0; i<array.length ; i++) {
        	System.out.println(array[i].nom);
        	System.out.println(array1[i].nom);
        	System.out.println(array2[i].nom);
        	System.out.println(array3[i].nom);
        }
        
        

 
//System.out.println(a.compareTo(c));
 

    } 

}
