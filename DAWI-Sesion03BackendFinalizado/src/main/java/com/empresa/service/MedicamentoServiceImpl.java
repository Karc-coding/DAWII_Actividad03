package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	@Autowired
	public MedicamentoRepository repo;
	
	@Override
	public List<Medicamento> listMedicamento() {
		return repo.findAll();
	}

	@Override
	public Medicamento saveMedicamento(Medicamento medicamento) {
		return repo.save(medicamento);
	}

}
