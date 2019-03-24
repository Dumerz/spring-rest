package io.dumerz.rest.dumerzrest.user;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String exception) {
		super(exception);
	}
}
