/**
 * lexikograficke triedenie mien, pomocou boblesort :-)
 * Dve rovnako dlh� polia String[] meno, a String[] priezvisko obsahuj� menoslov triedy tak, 
 * �e meno[i] a priezvisko[i] patria tej istej osobe. Utrie�te tento menoslov lexikograficky. 
 * Hint: upravte nejak� algoritmus triedenia pre va�e potreby. M��ete poi�i� s�bor (trieda.txt)
 * @author PB
 */
public class Class {
		  static String studenti[][] = {
				  {"Simona","Ba�kovsk�"},
				  {"Radovan","Balog"},
				  {"So�a","Bartekov�"},
				  {"Tom�","Bo�inec"},
				  {"Martina","Bodi�ov�"},
				  {"Tom�","Bord��"},
				  {"Michal","Chamula"},
				  {"Milan","Cifra"},
				  {"Izabela","Dob�ovi�ov�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Lucia","Kub��kov�"},
				  {"Patr�cia","Marmanov�"},
				  {"Martin","Ma�ek"},
				  {"M�ria","M�riov�"},
				  {"Tom�","Michal�k"},
				  {"Pavel","Miklo�"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"So�a","Bartekov�"},
				  {"Tom�","Bo�inec"},
				  {"Martina","Bodi�ov�"},
				  {"Tom�","Bord��"},
				  {"Michal","Chamula"},
				  {"Milan","Cifra"},
				  {"Izabela","Dob�ovi�ov�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Luk�","Mu�ila"},
				  {"Alexandra","Nyitraiov�"},
				  {"Monika","Victoria-Omachelov�"},
				  {"Michal","Ondreji�ka"},
				  {"Zoltan","Onody"},
				  {"Michal","Plevka"},
				  {"Pavel","Miklo�"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"So�a","Bartekov�"},
				  {"Tom�","Bo�inec"},
				  {"Martina","Bodi�ov�"},
				  {"Tom�","Bord��"},
				  {"Michal","Chamula"},
				  {"Milan","Cifra"},
				  {"Izabela","Dob�ovi�ov�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Luk�","Mu�ila"},
				  {"Alexandra","Nyitraiov�"},
				  {"Monika","Victoria-Omachelov�"},
				  {"Michal","Ondreji�ka"},
				  {"Zoltan","Onody"},
				  {"Tom�","Polakovi�"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Monika","Victoria-Omachelov�"},
				  {"Michal","Ondreji�ka"},
				  {"Zoltan","Onody"},
				  {"Michal","Plevka"},
				  {"Tom�","Polakovi�"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Lucia","Kub��kov�"},
				  {"Patr�cia","Marmanov�"},
				  {"Martin","Ma�ek"},
				  {"M�ria","M�riov�"},
				  {"Tom�","Michal�k"},
				  {"Pavel","Miklo�"},
				  {"Luk�","Mu�ila"},
				  {"Alexandra","Nyitraiov�"},
				  {"Monika","Victoria-Omachelov�"},
				  {"Michal","Ondreji�ka"},
				  {"Zoltan","Onody"},
				  {"R�bert","Ruska"},
				  {"Oliver","�ab�k"},
				  {"Miroslav","�af�rik"},
				  {"Michal","S�le�"},
				  {"Vikt�ria","�im��kov�"},
				  {"Michal","Singer"},
				  {"Dana","�korv�nkov�"},
				  {"Tom�","Sl�ma"},
				  {"Gabriela","Slaninkov�"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Andrea","Spi��kov�"},
				  {"L�via","Sta�kovi�ov�"},
				  {"P�ter","Stingel"},
				  {"Erik","Szalay"},
				  {"Richard","T�th"},
				  {"Michaela","V�vrov�"},
				  {"Adam","Voz�r"},
				  {"Radovan","Balog"},
				  {"So�a","Bartekov�"},
				  {"Tom�","Bo�inec"},
				  {"Martina","Bodi�ov�"},
				  {"Tom�","Bord��"},
				  {"Michal","Chamula"},
				  {"Milan","Cifra"},
				  {"Izabela","Dob�ovi�ov�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Lucia","Kub��kov�"},
				  {"Patr�cia","Marmanov�"},
				  {"Martin","Ma�ek"},
				  {"M�ria","M�riov�"},
				  {"Tom�","Michal�k"},
				  {"Pavel","Miklo�"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"So�a","Bartekov�"},
				  {"Tom�","Bo�inec"},
				  {"Martina","Bodi�ov�"},
				  {"Tom�","Bord��"},
				  {"Michal","Chamula"},
				  {"Milan","Cifra"},
				  {"Izabela","Dob�ovi�ov�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Luk�","Mu�ila"},
				  {"Alexandra","Nyitraiov�"},
				  {"Monika","Victoria-Omachelov�"},
				  {"Michal","Ondreji�ka"},
				  {"Zoltan","Onody"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Michal","Plevka"},
				  {"Tom�","Polakovi�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Luk�","Mu�ila"},
				  {"Alexandra","Nyitraiov�"},
				  {"Monika","Victoria-Omachelov�"},
				  {"Michal","Ondreji�ka"},
				  {"Zoltan","Onody"},
				  {"Michal","Plevka"},
				  {"Tom�","Polakovi�"},
				  {"Tom�","Bo�inec"},
				  {"Martina","Bodi�ov�"},
				  {"Tom�","Bord��"},
				  {"Michal","Chamula"},
				  {"Milan","Cifra"},
				  {"Izabela","Dob�ovi�ov�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Lucia","Kub��kov�"},
				  {"Patr�cia","Marmanov�"},
				  {"Martin","Ma�ek"},
				  {"M�ria","M�riov�"},
				  {"Tom�","Michal�k"},
				  {"Pavel","Miklo�"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"So�a","Bartekov�"},
				  {"Tom�","Bo�inec"},
				  {"Martina","Bodi�ov�"},
				  {"Tom�","Bord��"},
				  {"Michal","Chamula"},
				  {"Milan","Cifra"},
				  {"Izabela","Dob�ovi�ov�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Marek","Kraf��k"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Luk�","Mu�ila"},
				  {"Alexandra","Nyitraiov�"},
				  {"Monika","Victoria-Omachelov�"},
				  {"Michal","Ondreji�ka"},
				  {"Zoltan","Onody"},
				  {"Michal","Plevka"},
				  {"Tom�","Polakovi�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Lucia","Kub��kov�"},
				  {"Patr�cia","Marmanov�"},
				  {"Martin","Ma�ek"},
				  {"M�ria","M�riov�"},
				  {"Tom�","Michal�k"},
				  {"Pavel","Miklo�"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"So�a","Bartekov�"},
				  {"Tom�","Bo�inec"},
				  {"Martina","Bodi�ov�"},
				  {"Tom�","Bord��"},
				  {"Michal","Chamula"},
				  {"Milan","Cifra"},
				  {"Izabela","Dob�ovi�ov�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Matej","Kop��k"},
				  {"Samo","Kor�i�iak"},
				  {"J�n","Filip Kotora"},
				  {"Mat��","Kov��"},
				  {"Marek","Kraf��k"},
				  {"Radoslav","He�ko"},
				  {"Kl�ra","Horv�thov�"},
				  {"Jakub","Hranick�"},
				  {"Ondrej","Hru�ovsk�"},
				  {"Krist�na","Karafov�"},
				  {"Daniel","Kisel"},
				  {"Luk�","Mu�ila"},
				  {"Alexandra","Nyitraiov�"},
				  {"Monika","Victoria-Omachelov�"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Michal","Ondreji�ka"},
				  {"Zoltan","Onody"},
				  {"Michal","Plevka"},
				  {"Pavel","Miklo�"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Miroslav","Ferien��k"},
				  {"Patrik","Furm�nek"},
				  {"Gabriel","Halasi"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"So�a","Bartekov�"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  {"Tom�","Bo�inec"},
				  {"Martina","Bodi�ov�"},
				  {"Tom�","Bord��"},
				  {"Michal","Chamula"},
				  {"Milan","Cifra"},
				  {"Izabela","Dob�ovi�ov�"},
				  {"Martina","�uricov�"},
				  {"Sab�na","Fa�kovcov�"},
				  {"Patrik","Fa�ang"},
				  {"Adam","Polakovi�"},
				  {"Patrik","Priebera"},
				  {"G�bor","Pusk�s"},
				  {"Marianna","R�chelov�"},
				  {"Patrik","Fa�ang"},
				  {"David","Fekia�"},
				  };
		  /**
		   * hlavny program obsahuje buble sort z prednasky, jemne upraveny
		   */
		  public static void main(String[] args) {
			  int MAX = studenti.length;
			  for (int i = 0; i < MAX ; i++) {
				     for (int j = MAX-1; j>i ; j--) {
				        if ((studenti[j-1][1].compareTo(studenti[j][1])>0) || 
				        		(studenti[j-1][1].equals(studenti[j][1]) && studenti[j-1][0].compareTo(studenti[j][0])>0)) {
				        	// j-1 musi ist z j
				        	// tak ich vymen
				           String[] temp = studenti[j];
				           studenti[j] = studenti[j-1];
				           studenti[j-1] = temp;
				         }
				     }
				  }
			  for (int i = 0; i < MAX ; i++) {
				  System.out.println(studenti[i][1] + " " + studenti[i][0]);
			  }
		  }
}