package com.cmancode.thsmvc.exeptions;


@SuppressWarnings("serial")
public class DuplicateInstanceException extends InstanceException{
	
    public DuplicateInstanceException(Object key, String className) {
        super("Duplicate instance", key, className);
    }
    
}
