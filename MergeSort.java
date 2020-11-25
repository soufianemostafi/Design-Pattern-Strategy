package stratégie;

class MergeSort implements Strategy { 
	
	void fusion(int tab[], int debut, int milieu, int fin) {
        int n1 = milieu - debut + 1;
        int n2 = fin - milieu;
 
        int G[] = new int[n1];
        int D[] = new int[n2];
 
        for (int i = 0; i < n1; i++)
            G[i] = tab[debut + i];
        for (int j = 0; j < n2; j++)
            D[j] = tab[milieu + 1 + j];
 
        
        int i, j, k;
        i = 0;
        j = 0;
        k = debut;
 
        while (i < n1 && j < n2) {
            if (G[i] <= D[j]) {
                tab[k] = G[i];
                i++;
            } else {
                tab[k] = D[j];
                j++;
            }
            k++;
        }
 
        
        while (i < n1) {
            tab[k] = G[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            tab[k] = D[j];
            j++;
            k++;
        }
    }
 
    
    void triFusion(int tab[], int debut, int fin) {
        if (debut < fin) {
 
            
            int m = (debut + fin) / 2;
 
            triFusion(tab, debut, m);
            triFusion(tab, m + 1, fin);
 
            
            fusion(tab, debut, m, fin);
        }
    }
    
    
	void fusion_produit(Produit produit[], int debut, int milieu, int fin) {
        int n1 = milieu - debut + 1;
        int n2 = fin - milieu;
 
        Produit G[] = new Produit[n1];
        Produit D[] = new Produit[n2];
 
        for (int i = 0; i < n1; i++)
            G[i] = produit[debut + i];
        for (int j = 0; j < n2; j++)
            D[j] = produit[milieu + 1 + j];
 
        
        int i, j, k;
        i = 0;
        j = 0;
        k = debut;
 
        while (i < n1 && j < n2) {
            if (G[i].compareTo(D[j]) <= 0) {
                produit[k] = G[i];
                i++;
            } else {
                produit[k] = D[j];
                j++;
            }
            k++;
        }
 
        
        while (i < n1) {
            produit[k] = G[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            produit[k] = D[j];
            j++;
            k++;
        }
    }
 
    
    void triFusion_produit(Produit produit[], int debut, int fin) {
        if (debut < fin) {
 
            
            int m = (debut + fin) / 2;
 
            triFusion_produit(produit, debut, m);
            triFusion_produit(produit, m + 1, fin);
 
            
            fusion_produit(produit, debut, m, fin);
        }
    }

	 

    @Override 

    public void sort(int[] numbers) { 
    	
    	triFusion(numbers, 0, numbers.length - 1);
    	
        System.out.println("sorting array using merge sort strategy"); 

 

    } 
    
    
    @Override 

    public void sort(Produit[] produit) { 
    	
    	triFusion_produit(produit, 0, produit.length - 1);
    	
        System.out.println("sorting array using merge sort strategy"); 

 

    } 

}

