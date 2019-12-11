import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner  binaerScan = new Scanner(System.in);
		System.out.println("Geben Sie ihre Dualzahl ein: ");
		
		int binaer=binaerScan.nextInt();
		int hochZahl=0;
		int teilZahl=0;
		int zwischenZahl=0;
		
		String laenge =Integer.toString(binaer);
		char[] c = new char[laenge.length()];
		c=laenge.toCharArray();
		try {
			if(c.length<8) {
				throw new BinaerException("Deine Binaerzahl is zu klein. Mindestens 8 Zeichen");
			}
			if(c.length>13) {
				throw new BinaerException("Deine Binaerzahl ist zu lang. Maximal 13 Zeichen");
			}
			for(int i=0; i<c.length;i++) {
				
				if(c[i]=='0'||c[i]=='1'){
					continue;
				}
				throw new BinaerException("Eine Binaerzahl besteht nur aus 0 und 1");	
			}
			while(binaer !=0) {
				zwischenZahl=binaer % 10;
				teilZahl=teilZahl+(int)(zwischenZahl*(Math.pow(2, hochZahl)));
				binaer=binaer/10;
				hochZahl++;
			}
			System.out.println(teilZahl);
		}
		catch(BinaerException be) {
			be.printStackTrace();
		}
	}

}
