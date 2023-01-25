import java.util.Scanner;

public class KdvHesaplamasi {

	public static void main(String[] args) {
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("KDV'sini hesaplamak istediğiniz tutarı girin: ");
		
		double para = input.nextInt();
		double kdvTutari;
		double kdvOrani = 0;
		double kdvlitutar = 0;
		
		if(para >= 0 && para<= 1000) {
			 kdvOrani = 0.18;
			 kdvTutari= para * kdvOrani ;
			 kdvlitutar= para + kdvTutari;
			
		} else if (para > 1000) {
			 kdvOrani = 0.08;
			 kdvTutari =  (para * kdvOrani);
			 kdvlitutar=  (para + kdvTutari);
			
			
		}
		
		
		System.out.println("KDV'siz tutarınız : " + para);
		
		
		System.out.println("KDV Oranınız : " + kdvOrani);
		
		System.out.println("KDV'li yeni tutarınız: " + kdvlitutar);
		
		
		
		
			
		
		
		
		
		
		

	}

}
