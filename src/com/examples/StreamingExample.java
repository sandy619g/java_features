package com.examples;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamingExample {
	public static void main(String[] args) {
		
	UnaryOperator<Integer> iterator = integer -> integer + 1;

    System.out.println("-- sequential streaming ---");
    Stream.iterate(1, iterator)
          .limit(5)
          .sequential()
          .forEach(StreamingExample::process);

    System.out.println("-- parallel streaming---");
    Stream.iterate(1, iterator)
          .parallel()
          .limit(5)
          .forEach(StreamingExample::process);

	}
	private static void process(Integer integer) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(integer + " - " + LocalTime.now());
    }
}
