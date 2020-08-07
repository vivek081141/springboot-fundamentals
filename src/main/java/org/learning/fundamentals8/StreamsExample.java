/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

  public List<Integer> getIntegersFromString (List<String> list1) {
    return list1.stream().map( s -> Integer.parseInt( s )).collect( Collectors.toList());
  }

  public List<String> filterList (List<String> list, String element) {
    return list.stream().filter( s -> element.equals( s)).collect( Collectors.toList());
  }


  public Stream<Stream<String>> getStreamOfStreams(Stream<String> stream1, Stream<String> stream2) {
     return Stream.of( stream1, stream2 );
  }

  public Stream<List<String>> getListOfStream(List<String> list1, List<String> list2) {
    return Stream.of( list1, list2 );
  }

  public Stream<List<String>> getStreamBuilder(List<String> list1, List<String> list2) {
    Stream.Builder builder = Stream.builder();
    builder.accept( list1 );
    builder.accept( list2 );
    return builder.build();
  }

  public List<String> getFlattenList1(List<String> list1, List<String> list2) {
    Stream<List<String>> stream = getStreamBuilder(list1, list2);
    List<String> flattenedList = stream.flatMap( s -> s.stream() )
            .collect( Collectors.toList());
    return flattenedList;
  }


  public List<String> getFlattenList2(Stream<String> stream1, Stream<String> stream2) {
    Stream<Stream<String>> stream = getStreamOfStreams(stream1, stream2);

    Function<String, Stream<String>> function = s -> s;
    List<String> flattenedList =  stream.flatMap( s-> s )
            .collect( Collectors.toList());
    return flattenedList;
  }

  public void flatMap(Stream<String> stream1, Stream<String> stream2) {
    Stream<Stream<String>> stream = getStreamOfStreams(stream1, stream2);
    Stream<String> flattenedList = stream.flatMap( new Function<Stream<String>, Stream<? extends String>>() {
      @Override
      public Stream<? extends String> apply(Stream<String> stringStream) {
        return null;
      }
    } );
  }


  public String findFirstElement(Stream<String> stream) {
    String firstElement = stream.findFirst().orElse( null );
    return firstElement;
  }
}
