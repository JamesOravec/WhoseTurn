package edu.unlv.cs673.whoseturn.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("helloworld")
public interface HelloWorldService extends RemoteService {
	String sayHiToTheNiceWorld(String name) throws IllegalArgumentException;
}
