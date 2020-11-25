package stratégie;

class QuickSort implements Strategy {
	
	
	public static int partition(int tab[], int b, int e) {
	    int pivot = tab[e];
	    int i = (b-1);
	 
	    for (int j = b; j < e; j++) {
	        if (tab[j] <= pivot) {
	            i++;
	 
	            int a = tab[i];
	            tab[i] = tab[j];
	            tab[j] = a;
	        }
	    }
	 
	    int a = tab[i+1];
	    tab[i+1] = tab[e];
	    tab[e] = a;
	 
	    return i+1;
	}
	
	public static void tri_rapide(int tab[], int p, int q) {
	    if (p < q) {
	        int index = partition(tab, p, q);
	 
	        tri_rapide(tab, p, index-1);
	        tri_rapide(tab, index+1, q);
	    }
	}
	
	
	
	
	public static int partition_produit(Produit produit[], int b, int e) {
	    Produit pivot = produit[e];
	    int i = (b-1);
	 
	    for (int j = b; j < e; j++) {
	        if (produit[j].compareTo(pivot) <= 0) {
	            i++;
	 
	            Produit a = produit[i];
	            produit[i] = produit[j];
	            produit[j] = a;
	        }
	    }
	 
	    Produit a = produit[i+1];
	    produit[i+1] = produit[e];
	    produit[e] = a;
	 
	    return i+1;
	}
	
	public static void tri_rapide_produit(Produit produit[], int p, int q) {
	    if (p < q) {
	        int index = partition_produit(produit, p, q);
	 
	        tri_rapide_produit(produit, p, index-1);
	        tri_rapide_produit(produit, index+1, q);
	    }
	}



	@Override 

    public void sort(int[] numbers) { 
    	tri_rapide(numbers,0,(numbers.length)-1);

        System.out.println("sorting array using quick sort strategy"); 

 

    } 
	
	@Override 

    public void sort(Produit[] produit) { 
    	tri_rapide_produit(produit,0,(produit.length)-1);

        System.out.println("sorting array using quick sort strategy"); 

 

    }

} 
