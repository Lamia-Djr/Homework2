
public class Personne {
private String nom,prenom,nationalite;
private int age;
private static int nbramis=0;
private Personne[] amis=new Personne[100];
public Personne(String nm,String pr,String nat,int ag){
	this.nom=nm; this.prenom=pr; this.nationalite=nat;this.age=ag;
}
public Personne(Personne p){
	nom=p.nom; prenom=p.prenom; nationalite=p.nationalite; age=p.age;
}
public void AjoutAmi(Personne p){
	amis[nbramis]=new Personne(p);
	nbramis++;
}
public String toString(){
	return this.nom+" "+this.prenom+" age(e) de "+this.age+" an(s) de nationalite "+this.nationalite;
}
public void AfficheAmis(){
	if(nbramis==0)
	System.out.println("Vous ne possedez aucun ami(e), votre liste de contacts est vide!");
	else{			
	System.out.println("Vos amis sont : ");
	for(int i=0;i<nbramis;i++)
	System.out.println(this.amis[i]);}
}
public void AfficheAmisEtrangers(){
	int c=0;
	if(nbramis==0)
	System.out.println("Vous ne possedez aucun(e) ami(e), votre liste de contacts est vide!");
	else{
	if(this.nationalite=="algerienne"){
			for(int i=0;i<nbramis;i++){
			if(this.amis[i].nationalite!="algerienne"){
					System.out.println(this.amis[i]);
					c++;
			}
			}
			if(c==0)
				System.out.println("Vous ne possedez aucun(e) ami(e) etranger(e)");
	}
	}
}
}
