package com.examples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Program to add elements of a Stream into an existing list in Java
public class AddStreamToList
{
	public static void main (String[] args)
	{
		Stream<String> source = Stream.of("grape", "apricot");
		List<String> target = new ArrayList<>(Arrays.asList("apple", "plum", "peach"));

		source.collect(Collectors.toCollection(() -> target));
		System.out.println(target);
	}
}
