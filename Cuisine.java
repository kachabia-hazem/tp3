public class Cuisine {
    private String nom_aliment, etat;
    private int quantite;
    private String unit;

    Cuisine(String nom_aliment, String etat, int quantite, String unite) {
        this.nom_aliment = nom_aliment;
        this.etat = etat;
        this.quantite = quantite;
        this.unit = unite;
    }
    Cuisine(String nom_aliment){
    	this.nom_aliment=nom_aliment;
    }
    

    public String getnom_aliment() {
        return this.nom_aliment;
    }

    public void setnom_aliment(String na) {
        this.nom_aliment = na;
    }

    public int getquantite() {
        return this.quantite;
    }

    public void setquantite(int q) { 
        this.quantite = q;
    }

    public String getetat() {
        return this.etat;
    }

    public void setetat(String e) {
        this.etat = e;
    }

    public String getunite() {
        return this.unit;
    }

    public void setunite(String u) {
        this.unit = u;
    }

    public String toString() {
        return "Le nom de l'ingrédient est " + this.nom_aliment + ", la quantité est " + this.quantite +
               " " + this.unit + ", et l'état est " + this.etat;
    }

    public boolean equals(Cuisine c) {
        return this.nom_aliment.equals(c.getnom_aliment()) && this.etat.equals(c.getetat());
    }

    
    public static void main(String[] args) {
        Plat p = new Plat("cordon bleu");
        
    }
}
public class Plat extends Cuisine {
    private String nom;
    private Cuisine[] t; 

  
    public Plat(String nom, String nom_aliment, String etat, int quantite, String unite, int tailleTableau) {
        super(nom_aliment, etat, quantite, unite); 
        this.nom = nom;
        this.t = new Cuisine[tailleTableau]; 
    }
    public Plat(String nom) {
    	this.nom=nom;
    }

    public String getnom() {
        return this.nom;
    }

    public Cuisine[] gett() {
        return this.t;
    }

    public void sett(Cuisine[] t) {
        this.t = t;
    }
}

