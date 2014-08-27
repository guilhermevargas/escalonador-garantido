package com.controller;

public interface AbstractEscalonador {
	void suspender();
	
	Thread getProximoProcesso();
	
	void escalona();
}	
