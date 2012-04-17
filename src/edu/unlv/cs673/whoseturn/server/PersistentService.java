// Example code from: http://www.fishbonecloud.com/2010/11/use-objectify-to-store-data-in-google.html
package edu.unlv.cs673.whoseturn.server;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

//The RemoteServiceRelativePath annotation must match the servlet URL configured in
//web.xml
@RemoteServiceRelativePath("persistentservice")
public interface PersistentService extends RemoteService {
    
    void persistAnimal(String color, String species) throws IllegalArgumentException;
    
}