package com.ogcg.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		// Notese como si se conoce cual clase es cual
		System.out.println("Factory " + pc.getClass().getSimpleName() +" Config::" +pc);
		System.out.println("Factory "+ server.getClass().getSimpleName() +" Config::" +server);
	}

}
