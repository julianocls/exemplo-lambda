package com.exemplo;

import java.util.List;

import com.exemplo.dao.FaturaDAO;
import com.exemplo.model.Fatura;
import com.exemplo.util.EmailSender;

public class Lambda {

	public static void main(String[] args) {

		FaturaDAO faturaDAO = new FaturaDAO();

		List<Fatura> faturas = faturaDAO.buscarFaturas();

//		for(Fatura f : faturas) {
//			EmailSender.enviaEmail(f.getEmailDevedor(), f.resumo());
//		}

		faturas.forEach(f -> {
			EmailSender.enviaEmail(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});

	}

}
