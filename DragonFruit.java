public class DragonFruit {
    private double prix;
    private String origine;
	
    public DragonFruit() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public DragonFruit(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "DragonFruit de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 DragonFruits sont equivalentes
        if(o != null && getClass() == o.getClass()){
           DragonFruit df = (DragonFruit) o;
            return (prix == df.prix && origine.equals(df.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        Orange DF1 = new DragonFruit();
        Orange DF2 = new DragonFruit(3,"maroc");
        System.out.println(DF1.getOrigine());
	System.out.println("premier test dragonfruit");
   }
}
