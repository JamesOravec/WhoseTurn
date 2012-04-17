// Example code from: http://www.fishbonecloud.com/2010/11/use-objectify-to-store-data-in-google.html
package edu.unlv.cs673.whoseturn.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.unlv.cs673.whoseturn.server.PersistentService;
import edu.unlv.cs673.whoseturn.server.PersistentServiceAsync;

public class ObjectifyExample implements EntryPoint {

    // Create some fields for the UI
    VerticalPanel mainVerticalPanel = new VerticalPanel();
    HorizontalPanel hp1 = new HorizontalPanel();
    HorizontalPanel hp2 = new HorizontalPanel();
    HTML colorLabel = new HTML("Color");
    HTML speciesLabel = new HTML("Species");
    TextBox colorTextBox = new TextBox();
    TextBox speciesTextBox = new TextBox();
    Button submit = new Button("Submit");

    // Instantiate the interfaces to access methods in the interface
    private final PersistentServiceAsync persistentService = GWT
            .create(PersistentService.class);

    public void onModuleLoad() {

        hp1.add(colorLabel);
        hp1.add(colorTextBox);
        hp2.add(speciesLabel);
        hp2.add(speciesTextBox);

        mainVerticalPanel.add(hp1);
        mainVerticalPanel.add(hp2);
        mainVerticalPanel.add(submit);

        hp1.setSpacing(5);
        hp2.setSpacing(5);
        mainVerticalPanel.setSpacing(5);
        
        
        //Add a click handler to the button.  The click handler will
        //make an RPC call using the PersistentService interfaces
        submit.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {

                persistentService.persistAnimal(colorTextBox.getText(),
                        speciesTextBox.getText(), new AsyncCallback<Void>() {

                            @Override
                            public void onFailure(Throwable caught) {

                                System.out
                                        .println("PersistentService RPC call failed "
                                                + caught);

                            }

                            @Override
                            public void onSuccess(Void result) {

                                System.out
                                        .println("PersistentService RPC call succedded");

                            }

                        });

            }
        });

        RootPanel.get("container").add(mainVerticalPanel);
    }
}