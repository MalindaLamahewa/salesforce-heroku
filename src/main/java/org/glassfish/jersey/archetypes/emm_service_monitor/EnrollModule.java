package org.glassfish.jersey.archetypes.emm_service_monitor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/enroll")
public class EnrollModule {	
	
	@GET
	@Path("/access/{token}")
	public Boolean setAccess(@PathParam("token")String val){		
		final String strToken = "abc@123";	
		if(strToken.contains(val)){
			return true;
		}
		else {
			return false;
		}
	}
}
