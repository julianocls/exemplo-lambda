package com.exemplo.util;

public class EmailSender {

	public static void enviaEmail(String email, String msg) {
		System.out.printf("Email enviado para %s. Obs: %s \n", email, msg);
	}
}
