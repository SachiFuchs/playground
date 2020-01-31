package com.bmw.back2code;

import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class HelloMaven {

	public static void main(String[] args) {
		String[] a = new String[] { "Hello", "Back2Coder", "says", "HelloMaven" };
		for (ICombinatoricsVector<?> perm : permutations(a)) {
			System.out.println(perm);
		}
	}

	public static Iterable<ICombinatoricsVector<String>> permutations(String[] a) {
		ICombinatoricsVector<String> originalVector = Factory.createVector(a);
		Generator<String> gen = Factory.createPermutationGenerator(originalVector);
		return gen;
	}
}
