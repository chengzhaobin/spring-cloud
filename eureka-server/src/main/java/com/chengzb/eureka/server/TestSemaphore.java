package com.chengzb.eureka.server;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class TestSemaphore {
public static void main(String[] args) {
	Semaphore semaphore=new Semaphore(3);
	ExecutorService service=Executors.newFixedThreadPool(4);
		Task task1=new Task(semaphore,3);
		Task task2=new Task(semaphore,1);
		Task task3=new Task(semaphore,1);
		Task task4=new Task(semaphore,1);
		service.execute(task2);
		service.execute(task1);
		service.execute(task3);
		service.execute(task4);
	service.shutdown();
}
	
}
