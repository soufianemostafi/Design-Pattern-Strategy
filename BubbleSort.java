package stratégie;

class BubbleSort implements Strategy { 
	
	@Override 
    public void sort(int[] numbers) { 
    	
        int taille = numbers.length;  
        int tmp = 0;  
        for(int i=0; i < taille; i++) 
        {
                for(int j=1; j < (taille-i); j++)
                {  
                        if(numbers[j-1] > numbers[j])
                        {
                                
                                tmp = numbers[j-1];  
                                numbers[j-1] = numbers[j];  
                                numbers[j] = tmp;  
                        }
 
                }
        }

        System.out.println("sorting array using bubble sort strategy"); 

    } 
	
	
	@Override 
    public void sort(Produit[] produit) { 
    	
        int taille = produit.length;  
        Produit tmp = new Produit("", 0);  
        for(int i=0; i < taille; i++) 
        {
                for(int j=1; j < (taille-i); j++)
                {  
                        if(produit[j-1].compareTo(produit[j]) > 0)
                        {
                                
                                tmp = produit[j-1];  
                                produit[j-1] = produit[j];  
                                produit[j] = tmp;  
                        }
 
                }
        }

        System.out.println("sorting array using bubble sort strategy"); 

    }

} 