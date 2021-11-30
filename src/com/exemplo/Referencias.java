package com.exemplo;

import java.util.List;

import com.exemplo.dao.FaturaDAO;
import com.exemplo.model.Fatura;

public class Referencias {
	public static void main(String[] args) {

		List<Fatura> faturas = new FaturaDAO().buscarFaturas();

		faturas.forEach(Fatura::atualizarStatus);

	}
}
