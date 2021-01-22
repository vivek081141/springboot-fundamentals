
/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.learning.java8.StreamsExample;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExampleTest {

  private StreamsExample javaStreams;

  @Before
  public void init() {
    javaStreams = new StreamsExample();
  }

  /**
   * Stream -> Map
   * Convert List to Integer Using Stream
   */
  @Test
  public void getIntegerList() {
    List<String> list1 = List.of("1", "2", "3");
    List<Integer> integerList = javaStreams.getIntegersFromString(list1);
    Assertions.assertEquals(1, integerList.get(0));
    Assertions.assertEquals(list1.size(), integerList.size());
  }

  /**
   * Stream -> Filter
   */
  @Test
  public void filterTest() {
    List<String> list1 = List.of("1", "2", "3");
    List<String> output = javaStreams.filterList(list1, list1.get(0));
    Assertions.assertEquals("2", output.get(0));
    Assertions.assertEquals(list1.size(), output.size() - 1);
  }

  /**
   * Stream: Stream of Stream
   * Input = List<String> & List<String>
   * Output = Stream<Stream<String>>
   */
  @Test
  public void test() {
    List<String> list1 = List.of("A", "B", "C");
    List<String> list2 = List.of("A", "B", "C");
    Stream<Stream<String>> streamStream = javaStreams.getStreamOfStreams(list1.stream(), list2.stream());
  }

  /**
   * Stream: Stream of List
   * Input = List<String> & List<String>
   * Output = Stream<List<String>>
   */
  @Test
  public void streamOfList() {
    List<String> list1 = List.of("A", "B", "C");
    List<String> list2 = List.of("A", "B", "C");
    Stream<List<String>> streamOf = javaStreams.getListOfStream(list1, list2);
    streamOf.forEach(list -> {
      list.forEach(System.out::println);
    });
  }


  /**
   * Stream: Stream Builder
   */
  @Test
  public void streamBuilderTest() {
    List<String> list1 = List.of("A", "B", "C");
    List<String> list2 = List.of("A", "B", "C");
    Stream<List<String>> streamOf = javaStreams.getStreamBuilder(list1, list2);
    streamOf.forEach(list -> {
      list.forEach(s -> System.out.println(s));
    });
  }

  /**
   * Stream : Flatten Stream
   * List<String> + List<String> to List<String>
   */
  @Test
  public void flattenListOfStreams() {
    List<String> list1 = List.of("A", "B", "C");
    List<String> list2 = List.of("A", "B", "C");
    List<String> output = javaStreams.getFlattenList1(list1, list2);
    output.forEach(s -> System.out.println(s));
  }

  /**
   * Stream : Flatten Stream
   * List<String> + List<String> to List<String>
   * What is identity function?
   */
  @Test
  public void flattenListOfList() {
    List<String> list1 = List.of("A", "B", "C");
    List<String> list2 = List.of("A", "B", "C");
    List<String> output = javaStreams.getFlattenList2(list1.stream(), list2.stream());
    output.forEach(s -> System.out.println(s));
  }

  /**
   * Stream -> FindFirst
   */
  @Test
  public void findFirst() {
    List<String> list1 = List.of("1", "2", "3");
    String firstElement = javaStreams.findFirstElement(list1.stream());
    Assertions.assertEquals("1", firstElement);

    Integer firstInteger = list1.stream().map(x -> Integer.parseInt(x)).filter(x -> x > 1).findFirst().orElse(0);
    Assertions.assertEquals(2, firstInteger);

    Optional<Integer> x1 = list1.stream().map(x -> Integer.parseInt(x)).filter(x -> x > 1).findFirst();

    Assertions.assertEquals(2, x1.get());
    Optional<String> optional = Optional.of("1");
    Assertions.assertEquals("1", optional.or(() -> Optional.of("1")).get());

  }

}
