package com.dream.automation.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dream.automation.app.response.ResponseAdd;

@RestController
@SuppressWarnings("rawtypes")
public class AutomateController {

	@GetMapping("/add/{n1}/{n2}")
	public ResponseEntity getUserInfoByUsername(@PathVariable int n1, @PathVariable int n2) {
		try {
			ResponseAdd resultObj = new ResponseAdd(n1, n2, n1 + n2);
			return ResponseEntity.status(HttpStatus.OK).body(resultObj);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
		}
	}
}
