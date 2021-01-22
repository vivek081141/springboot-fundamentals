/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.java8;

import org.learning.java8.models.Person;
import org.learning.java8.util.ModelMock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

  public List<Person> addArrayList() {
    List<Person> mergedList = new ArrayList<>();
    List<Person> personList01 = ModelMock.createPersonList("Test", 5);
    List<Person> personList02 = ModelMock.createPersonList("Rest", 5);
    List<Person> personList03 = ModelMock.createPersonList("Best", 5);
    personList01.forEach(x -> mergedList.add(x));
    personList02.forEach(x -> mergedList.add(x));
    personList03.forEach(x -> mergedList.add(x));
    return mergedList;
  }

  public List<Person> addStreamsOfStreams() {
    List<Person> personList01 = ModelMock.createPersonList("Test", 5);
    List<Person> personList02 = ModelMock.createPersonList("Rest", 5);
    List<Person> personList03 = ModelMock.createPersonList("Best", 5);
    Stream<Stream<Person>> stream = Stream.of(personList01.stream(), personList02.stream(), personList03.stream());
    return stream.flatMap(x -> x).collect(Collectors.toList());
  }

  public List<Person> addStreams() {
    List<Person> personList01 = ModelMock.createPersonList("Test", 5);
    List<Person> personList02 = ModelMock.createPersonList("Rest", 5);
    List<Person> personList03 = ModelMock.createPersonList("Best", 5);
    List<List<Person>> personList = Arrays.asList(personList01, personList02, personList03);
    return personList.stream().flatMap(person -> person.stream())
            .collect(Collectors.toList());
  }


}

