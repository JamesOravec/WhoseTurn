package edu.unlv.cs673.whoseturn.server;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.unlv.cs673.whoseturn.client.GreetingService;
import edu.unlv.cs673.whoseturn.client.HelloWorldService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class HelloWorldServiceImpl extends RemoteServiceServlet implements
HelloWorldService {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("Hello, world");
    }

	@Override
	public String sayHiToTheNiceWorld(String name) throws IllegalArgumentException {
		
		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script vulnerabilities.
		name = escapeHtml(name);
		userAgent = escapeHtml(userAgent);

		return "Hello wolrd and hello " + name;
	}
	
	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
	
}
