# SpringBootSpringDataMultithreadingExample + Design Patterns
Spring boot Asyn Multithreading App

1. Asyn Multithreading in Spring boot using ThreadPoolTaskExecutor 
   <br><b> Save method is written in async vs normal mode</b>
2. Triying to create a Springboot Scheduler App using ThreadPoolTaskScheduler
3. Java Multithreading using ExecutorServices
4. H2 Console at http://localhost:9089/h2-console/login.jsp?jsessionid=d22fc1a912caffefca950ff95af42756
jdbc url: jdbc:h2:mem:testdb

Link: https://www.youtube.com/watch?v=3rJBLFA95Io
http://tutorials.jenkov.com/java-util-concurrent/executorservice.html


<b><u>Design Patterns</u></b>
<ul>
   <li>Creational Pattern </li>
         <ul> 
            <li> Singleton Pattern: Threadsafe, early(static),lazy loading </li>
            <li> Builder Pattern: Building immutable objects </li>
            <li> Prototype Pattern: To create objects from a map of objects or from a pool of objects </li>
            <li> Factory Pattern: Factory pattern to create objects </li>
            <li> Abstract Pattern: Factory of factory </li>
         </ul>   
   <li>Structural Pattern </li>
      <ul>
          <li> Composite Pattern - Tree Structure, Leaf Component + Menu Component </li>
          <li> Adapter Pattern - Takes the Adaptee to implement new request </li>
          <li> Decorator Pattern - Aggregation and Composition</li>
      </ul>   
   <li>Behaviour Pattern </li>
   <ul>
          <li> Strategy Pattern - Basic Thread and Advanced Thread Execution</li>
          <li> Command Pattern - Invoker encapsulates Command. Command encapsulates Receiver.
             Receiver is FileSystem and Commands are OpenCommand, Read and Close File System</li>
          <li> Chain Of responsibility: Email is sent to the appropriate department, 
          department forwards it to next if its not applicable</li>   
   </ul>
</ul>   


Java 8
1. Spliterator