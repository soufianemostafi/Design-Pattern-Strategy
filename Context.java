package stratégie;

class Context { 

    private final Strategy strategy; 

 

    public Context(Strategy strategy) { 

        this.strategy = strategy; 

    } 

 

    public void arrange(int[] input) { 

        strategy.sort(input); 

    } 
    public void arrange(Produit[] input) { 

        strategy.sort(input); 

    }
    

} 