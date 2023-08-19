package edu.enock.main;

import java.util.Scanner;

import edu.enock.banco.ContaBanco;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("numero da conta: ");
		Integer number = sc.nextInt();
		   sc.nextLine();
		System.out.println("numero da agencia: ");
		String agency = sc.nextLine();
		System.out.println("seu nome: ");
		String name = sc.nextLine();
		System.out.println("seu saldo: ");
		Double balance = sc.nextDouble();
		
		ContaBanco con = new ContaBanco(number, agency, name, balance);
		System.out.println(con);
		
		sc.close();
	}
}
