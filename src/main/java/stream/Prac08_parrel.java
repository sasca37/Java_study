package stream;

import java.util.stream.IntStream;

public class Prac08_parrel {

	public static void main(String[] args) {
		long processTime1 = System.currentTimeMillis();
		IntStream.rangeClosed(65, 74).forEach(x -> System.out.println(Thread.currentThread().getClass() + "-" + (char)x));
		System.out.println("직렬스트림 출력 시간 : " + (System.currentTimeMillis() - processTime1));
		
		long processTime2 = System.currentTimeMillis();
		IntStream.rangeClosed(65, 74).parallel().forEach(x -> System.out.println(Thread.currentThread().getClass() + "-" + (char)x));
		System.out.println("병렬스트림출력 시간: " + (System.currentTimeMillis() - processTime2));
	}

}

