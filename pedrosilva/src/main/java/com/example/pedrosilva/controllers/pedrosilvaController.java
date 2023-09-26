package com.example.pedrosilva.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pedrosilva.entities.cliente;
import com.example.pedrosilva.servicies.pedrosilvaservice;

@RestController
@RequestMapping("/cliente")
public class pedrosilvaController {

	@Autowired
	private final pedrosilvaservice PedrosilvaService;

	public pedrosilvaController(pedrosilvaservice PedrosilvaService) {
			this.PedrosilvaService = PedrosilvaService;
		}

	@PostMapping
	public cliente createPedrosilva(@RequestBody cliente Pedrosilva) {
		return PedrosilvaService.savepedrosilva(Pedrosilva);
	}

	@GetMapping("/{id}")
	public cliente getService(@PathVariable Long idCliente) {
		return PedrosilvaService.getpedrosilvaById(idCliente);
	}

	@GetMapping
	public List<cliente> getAllPedrosilva() {
		return PedrosilvaService.getAllpedrosilva();
	}

	@DeleteMapping("/{id}")
	public void deletePedrosilva(@PathVariable Long idPedrosilva) {
		PedrosilvaService.deletepedrosilva(idPedrosilva);
	}

}
