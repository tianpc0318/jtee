package com.loner.pattern.factorymethod;

//ConcreteCreator 

public class StudentWorkFactory implements IWorkFactory {

	public Work getWork() {
		return new StudentWork();
	}

}
