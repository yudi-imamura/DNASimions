package com.service;

import java.util.Arrays;
import java.util.OptionalInt;

public class DnaService {

//	public boolean isSimian(String[] dna) {
//
//		int dnaSize = dna.length;
//
//	}

	public char[][] getArraysFromArray(String[] dna) {

		int columnLength = checkHigherLengthFromEachElement(dna);

		char[][] dnaSequences = new char[dna.length][columnLength];
		int line = 0;

		while (line < dna.length) {
			int column = 0;
			String dnaSequence = "";
			dnaSequence = dna[line];

			while (column < dnaSequence.length()) {
				dnaSequences[line][column] = dnaSequence.charAt(column);
				column++;
			}
			line++;

		}
		return dnaSequences;
	}

	int checkHigherLengthFromEachElement(String[] dna) {
		OptionalInt maxLength = Arrays.stream(dna).mapToInt(String::length).max();
		return maxLength.getAsInt();
	}

}
