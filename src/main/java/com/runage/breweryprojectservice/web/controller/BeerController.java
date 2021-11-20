package com.runage.breweryprojectservice.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.runage.breweryprojectservice.web.dto.BeerDTO;

@RequestMapping("/api/v1/beer")
@RestController
@SuppressWarnings("rawtypes")
public class BeerController {

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDTO> getBeerById(UUID beerId) {
		return new ResponseEntity<BeerDTO>(BeerDTO.builder().build(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity saveBeer(@RequestBody BeerDTO beerDTO) {
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@PutMapping("/{beerId}")
	public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDTO beerDTO) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("{/beerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable UUID beerId) {
	}
}
