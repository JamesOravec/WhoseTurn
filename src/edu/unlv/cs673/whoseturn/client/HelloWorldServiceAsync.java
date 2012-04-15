package edu.unlv.cs673.whoseturn.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloWorldServiceAsync {

	void sayHiToTheNiceWorld(String name, AsyncCallback<String> callback);

}
