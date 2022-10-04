package no.hvl.dat100.Goppgaver;

public class Konto {
	
	//Objektvariabler
	static int kontonummer;
	static double saldo;
	//konstruktør- Mal for å lage objekter med kontronummer og saldo
	public Konto(int kontonr, double saldoBeløp) {
		kontonummer = kontonr;
		saldo = saldoBeløp;
	}
	//metode- leser av saldo
	public static void avleseSaldo(double saldo) {
		
		System.out.println("Din saldo er: " + saldo);
	}
	//Metode- tar ut penger
	public static double withdraw(int kontonr, double saldoWithdraw) {
		kontonummer = kontonr;
		saldo = saldo - saldoWithdraw;
		System.out.println("Success full withdraw: "  + saldoWithdraw);
		
		return saldo;
	}
	//Metode- setter inn penger
	public static double deposit(int kontonr, double saldoDeposit) {
		kontonummer = kontonr;
		saldo = saldo + saldoDeposit;
		System.out.println("Successfull deposit: " + saldoDeposit);
		
		return saldo;
	}
	
	
	
	public static void main(String[] args) {
		//Objekt- konto nr1
		Konto k1 = new Konto(1, 5000.00);
		System.out.println("Velkommen brukernummer: " + k1.kontonummer);
		avleseSaldo(k1.saldo);
		withdraw(1, 1000);
		avleseSaldo(k1.saldo);
		deposit(1, 2500);
		avleseSaldo(k1.saldo);
		System.out.println();
		//Objekt- konto nr2
		Konto k2 = new Konto(2, 10000);
		System.out.println("Velkommen brukernummer: " + k2.kontonummer);
		avleseSaldo(k2.saldo);
		withdraw(2, 1000);
		avleseSaldo(k2.saldo);
		deposit(2, 2500);
		avleseSaldo(k2.saldo);
		System.out.println();
		//Objekt- konto nr3
		Konto k3 = new Konto(3, 7000);
		System.out.println("Velkommen brukernummer: " + k3.kontonummer);
		avleseSaldo(k3.saldo);
		withdraw(3, 1000);
		avleseSaldo(k3.saldo);
		deposit(3, 2500);
		avleseSaldo(k3.saldo);
	}

}
