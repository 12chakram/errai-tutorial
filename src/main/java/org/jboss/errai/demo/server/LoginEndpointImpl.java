package org.jboss.errai.demo.server;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.jboss.errai.demo.client.shared.LoginEndpoint;
import org.jboss.errai.demo.client.shared.User;
import org.jboss.errai.demo.client.shared.UserComplaint;
import org.jboss.errai.demo.client.shared.UserComplaintEndpoint;

/**
 * A stateless EJB implementing the REST endpoint to create, update and delete {@link UserComplaint}
 * objects.
 */
@Stateless
public class LoginEndpointImpl implements LoginEndpoint {

@Override
public Response login(User entity) {
	 return Response.created(UriBuilder.fromResource(LoginEndpoint.class).build()).build();
}

}