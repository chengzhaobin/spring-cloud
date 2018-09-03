package com.chengzb.eureka.server;

import java.util.concurrent.Semaphore;

public class Task implements Runnable{
	private Semaphore semaphore;
	private int i;
	public Task(Semaphore semaphore,int i){
		this.semaphore=semaphore;
		this.i=i;
	}
	@Override
	public void run() {
		try {
			semaphore.acquire(i);
			System.out.println(i+"---laile ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			semaphore.release(i);
		}
	}
}
