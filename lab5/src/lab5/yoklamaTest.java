package lab5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class yoklamaTest {
	static int[][] tablo=new int[5][10];
	public static void main(String[] args) {
		
		double count=0;
		//int toplam=0;
		double[]toplam = {0,0,0,0,0};
		Scanner inp=new Scanner(System.in);
		
		ArrayList<String> item=new ArrayList<String>();
		item.add("Ekonomik Sorunlar");
		item.add("E�itim Sorunlar�");
		item.add("Adalet Sorunlar�");
		item.add("Toplum Sorunlar�");
		item.add("Ki�isel Sorunlar");
		
		while(true) {
			System.out.println("Ankete girmke i�in 1");
			System.out.println("Anketten ��kmak i�in 2");
			int giris=inp.nextInt();
			if(giris==1) {
				count++;
				for(int k=0;k<5;k++) {
					System.out.println(item.get(k)+" ne kadar �nemli?");
					System.out.println("1den10a kadar derecelendirin:");
					int derece=inp.nextInt();
					for(int l=0;l<10;l++) {
						if(derece==l) {
							tablo[k][l-1]=tablo[k][l-1]+1;
						}
					}
				}
				
			}
			else if(giris==2) {
				break;
			}
			
		}
		
		for(int i=0;i<5;i++) {
			
			for(int j=1;j<11;j++) {
				
				int temp=tablo[i][j-1]*j;
				toplam[i]+=temp;
				
				
			}
			/*double ortalama=toplam/count;
			System.out.printf("%s ortalamas� %02f ",item.get(i),ortalama);*/
			
		}
		tabloYazd�r();
		double[] ortalama= {toplam[0]/count,toplam[1]/count,toplam[2]/count,toplam[3]/count,toplam[4]/count};
		for(int z=0;z<5;z++) {
			
		System.out.printf("%s ortalamas� %02f ",item.get(z),ortalama[z]);
		System.out.println("\n");
		}
		
		Arrays.sort(toplam);
		System.out.println(toplam[0]);
		System.out.println(toplam[4]);

	}
	public static void tabloYazd�r() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				System.out.printf("%d ",tablo[i][j]);
			}
			
			System.out.println(" \n");
			
		}
	}
	public static void girisEkran() {
		System.out.println("");
	}
	

}
