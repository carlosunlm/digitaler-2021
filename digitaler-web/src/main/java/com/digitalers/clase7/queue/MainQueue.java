package com.digitalers.clase7.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) {
		//los tipos wrapper ya tiene definido una prioridad
		//Queue<Cliente> datos = new PriorityQueue<>(new NombreASC());
		LinkedList<Cliente> datos = new LinkedList<>();
		
		//Collections.sort();
		
		//orden natural menor a mayor
		//datos.offer(head);
		datos.offer(new Cliente(25,"B"));//ASCCII
		datos.offer(new Cliente(85,"C"));
		datos.offer(new Cliente(21,"A"));
		
		Cliente vip = new Cliente(18,"VIP");
		
		if(vip.getNombre().equals("VIP")) {
			datos.addFirst(new Cliente(18,"D"));
		}else {
			datos.offer(vip);
		}
		
		datos.addLast(new Cliente(19,"z"));
		
		//Cliente head = datos.peek();		
		//System.out.println(head);
		
		//poll
		while(!datos.isEmpty()) {
			Cliente atendido = datos.poll();
			System.out.println("Atendimos a: " + atendido.getNombre());
			System.out.println("Quedan...");
			System.out.println(datos);
			if(datos.size() == 1) {
				System.err.println("Es el último");
			}
		}
			
		
	}

}
