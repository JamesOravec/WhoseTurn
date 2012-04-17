// Example code from: http://www.fishbonecloud.com/2010/11/use-objectify-to-store-data-in-google.html
package edu.unlv.cs673.whoseturn.server;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PersistentServiceAsync {

    void persistAnimal(String color, String species, AsyncCallback<Void> callback);

}