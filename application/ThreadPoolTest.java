package application;

import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors;
 
 public class ThreadPoolTest {
 	static public void main(String [] arg) {
 		int cpu = 4;
 		int m = 10000;
 		int n = 15000;
 		
 		long start=System.currentTimeMillis();
 		
 		ExecutorService pool = Executors.newFixedThreadPool(cpu);
 		
 		for(int i=3;i<=m;i+=2){
 			pool.execute(new Task(i));
 		}
 
 		pool.shutdown();
 		while(!pool.isTerminated()){
 			}
 		
 		System.out.println("\nsingle thread\n");
 		for(int j=m+1;j<=n;j++){
 			new Task(j).run();
 		}
 		
 		long stop=System.currentTimeMillis();
 		long time=stop-start;
 		System.out.println("time="+time);
 	}
 } 
