package Programs;


import java.util.stream.IntStream;

public class Que_11Parrallel_Stream {
public static void main(String[] args) {
	

IntStream i1=IntStream.rangeClosed(1, 10);
i1.forEach(System.out::println);
System.out.println("============================");
System.out.println("Parallel Stream number");
IntStream i2=IntStream.rangeClosed(1, 15);
i2.parallel().forEach(System.out::println);
}
}