package stratégie;

class InsertionSort implements Strategy { 

	@Override 

    public void sort(int[] numbers) { 
    	
    	int taille = numbers.length;  
        
        for (int i = 1; i < taille; i++)
        { 
             int index = numbers[i];  
             int j = i-1;  
          
             while(j >= 0 && numbers[j] > index)  
             {
            	 numbers[j+1] = numbers[j];  
                  j--;  
             }  
             numbers[j+1] = index; 
      }

        System.out.println("sorting array using insertion sort strategy"); 

    } 
	
@Override	
public void sort(Produit[] produit) { 
    	
    	int taille = produit.length;  
        
        for (int i = 1; i < taille; i++)
        { 
             Produit index = produit[i];  
             int j = i-1;  
          
             while(j >= 0 && ((produit[j]).compareTo(index)>0))  // > 
             {
            	 produit[j+1] = produit[j];  
                  j--;  
             }  
             produit[j+1]= index; 
      }

        System.out.println("sorting array using insertion sort strategy"); 

    }

} 