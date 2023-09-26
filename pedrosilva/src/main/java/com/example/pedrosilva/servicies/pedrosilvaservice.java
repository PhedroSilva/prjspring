package com.example.pedrosilva.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pedrosilva.entities.cliente;
import com.example.pedrosilva.repositories.pedrosilvarepository;


@Service
public class pedrosilvaservice {
	private final  pedrosilvarepository  Pedrosilvarepository;
	
	@Autowired
	public pedrosilvaservice ( pedrosilvarepository  Pedrosilvarepository) {
		this.Pedrosilvarepository =  Pedrosilvarepository;
	}
	
	public cliente savepedrosilva(cliente Pedrosilva) {
		return Pedrosilvarepository.save(Pedrosilva);
	}
	
	public cliente getpedrosilvaById(Long idCliente) {
		return Pedrosilvarepository.findById(idCliente).orElse(null);
	}
	
	public List<cliente> getAllpedrosilva(){
		return Pedrosilvarepository.findAll();
	}
	
	public void deletepedrosilva(Long idCliente) {
		Pedrosilvarepository.deleteById(idCliente);
	}
}
	
	

