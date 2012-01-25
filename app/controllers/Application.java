package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index(String username) {
    	session.put("username", username);
        render(username);
    }
    
    public static void appcache() {
    	
    	Logger.info("appcache.manifest being requested");
    	
    	String username = session.get("username");
    	response.setContentTypeIfNotSet("text/cache-manifest");
    	renderTemplate("Application/appcache", username);
    }

}