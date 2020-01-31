package com.bmw.back2code.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.paukov.combinatorics.ICombinatoricsVector;

import com.bmw.back2code.HelloMaven;
import com.google.common.collect.ImmutableList;

public class PermutationsTest {

	@Test
	public void test() {
		String[] x = { "a", "b", "c", "d" };
		
		ImmutableList<ICombinatoricsVector<String>> perm = ImmutableList.copyOf(HelloMaven.permutations(x));
		
		assertEquals(24, perm.size());
	}

}
