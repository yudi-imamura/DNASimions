package com.main;

import java.util.stream.Stream;

import com.service.DnaService;

public class DnaApplication {
	
	public static void main(String[] args) {
		
		String[] dna = {"CTGAGAGFGERGER", "CTGAGC", "TATTGT", "AGAGGG", "CCCCTA", "TCACTG","FREG","FTGR"};
		
		DnaService dnaService = new DnaService();
		char [][] dnaSequences = dnaService.getArraysFromArray(dna);
		
		Stream.of(dnaSequences).flatMap(Stream::of).forEach(System.out::println);
	}

}
