package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToListExample {
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>(Arrays.asList("Apple","Plum"));
		addToList(fruits, Stream.of("Grape","Peach"));
		System.out.println(fruits);
	}
	
	public static<T> void addToList(List<T> list,Stream<T> stream){
		stream.collect(Collectors.toCollection(() -> list));
	}
	
	public static<T> void addToList1(List<T> list,Stream<T> stream) {
		stream.sequential().collect(Collectors.toCollection(() -> list));
	}

}
