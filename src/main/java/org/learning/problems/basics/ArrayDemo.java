package org.learning.problems.basics;

public class ArrayDemo {

  public static void remove(String[] args) {
    String[] names = {"Vivek", "Ajay"}; //0

    //problem is remove one element "Chandra" to this array

    String[] tempArray = new String[names.length-1]; //1
    for (int i=0; i< names.length-1; i++) {
      tempArray[i] = names[i];
    }
    names = tempArray; //{"Vivek"}

    System.out.println(names);
  }

  /**
   public static void add(String[] args) {
   String[] names = {"Vivek", "Ajay"}; //2

   //problem is add one element "Chandra" to this array
   String name = "Chandra";

   String[] tempArray = new String[names.length+1]; //3
   for (int i=0; i< names.length; i++) {
   tempArray[i] = names[i];
   }

   //tempArray =  {"Vivek", "Ajay"}
   tempArray[names.length + 1] = name;
   //tempArray =  {"Vivek", "Ajay", "Chandra"}

   names = tempArray; //{"Vivek", "Ajay", "Chandra"}

   System.out.println(names);
   }
   */
}
