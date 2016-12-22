package none;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class RecipeList {

	final static String URL = 
		"https://androidcookbook.com/seam/resource/rest/recipe/list";

	public static void main(String[] args) {

		Client c = ClientBuilder.newBuilder().build();

		String resp = c.target(URL).request(MediaType.APPLICATION_XML).get(String.class);

		System.out.println(resp);
	}
}
