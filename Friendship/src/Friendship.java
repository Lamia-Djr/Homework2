import java.util.Scanner;

public class Friendship {
public static void main(String[] args) {
	Scanner clavier =new Scanner(System.in);
	System.out.println("Veuillez vous identifier s'il vous plait ");
	System.out.println("Saisissez Votre nom,prenom,nationalite et votre age dans l'ordre indique");
	String nom=clavier.nextLine();
	String prenom=clavier.nextLine();
	String nat=clavier.nextLine();
	int age=clavier.nextInt();
	
	Personne user=new Personne(nom,prenom,nat,age);
	System.out.println("Parfait!, que souhaitez vous faire ?\n \t 1- Ajouter un(e) ami(e) a votre liste de contact\n\t 2-Afficher votre liste d'amis\n\t 3-Afficher votre liste d'amis etrangers\n\t 4- Quitter");
    int n=clavier.nextInt();
	while(n!=4){
		switch(n){
		case 1:
			System.out.println("Saisissez le nom,prenom,nationalite et l'age de l'amis que vous souhaitez ajouter dans l'ordre indique");
			Scanner sc=new Scanner(System.in);
			String nm=sc.nextLine();
			String pr=sc.nextLine();
			String nt=sc.nextLine();
			int ag=sc.nextInt();
			Personne P=new Personne(nm,pr,nt,ag);
			user.AjoutAmi(P);
			System.out.println("Cette personne a ete ajoutee");
			break;
		case 2:
			user.AfficheAmis();
			break;
		case 3:
			user.AfficheAmisEtrangers();
			break;
		}
	System.out.println("Que voulez vous faire a present ?\n \t 1- Ajouter un(e) ami(e) a votre liste de contact\n\t 2-Afficher votre liste d'amis\n\t 3-Afficher votre liste d'amis etrangers\n\t 4- Quitter");
    n=clavier.nextInt();
    }

}
}
