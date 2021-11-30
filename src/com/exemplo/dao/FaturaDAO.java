package com.exemplo.dao;

import java.util.ArrayList;
import java.util.List;

import com.exemplo.model.Fatura;

public class FaturaDAO {

	public List<Fatura> buscarFaturas() {

		List<Fatura> faturas = new ArrayList<>();

		faturas.add(new Fatura("joao@gmail.com", 234.45));
		faturas.add(new Fatura("jose@gmail.com", 345.45));
		faturas.add(new Fatura("maria@gmail.com", 456.45));
		faturas.add(new Fatura("lura@gmail.com", 234.45));
		faturas.add(new Fatura("diego@gmail.com", 657.45));
		faturas.add(new Fatura("joaquim@gmail.com", 4563.45));

		return faturas;
	}

}
