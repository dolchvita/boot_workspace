package com.edu.boot0307.exception;

public class BoardException extends RuntimeException{
	
	public BoardException(String msg, Throwable e) {
		super(msg, e);
	}
	public BoardException(String msg) {
		super(msg);
	}
	
}
