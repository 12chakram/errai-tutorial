package org.jboss.errai.demo.client.local;

import javax.inject.Inject;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.demo.client.shared.LoginEndpoint;
import org.jboss.errai.demo.client.shared.User;
import org.jboss.errai.demo.client.shared.UserComplaint;
import org.jboss.errai.demo.client.shared.UserComplaintEndpoint;
import org.jboss.errai.enterprise.client.jaxrs.api.ResponseCallback;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Model;
import org.jboss.errai.ui.shared.api.annotations.Templated;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

/**
 * This is the companion Java class of the complaint form as specified by
 * {@link Templated}. It refers to a data field called "app-template" in
 * ComplaintForm.html as its root and gains access to all data fields in the
 * template to add dynamic behavior (e.g. event handlers, data bindings, page
 * transitions).
 * 
 * The {@link Page} annotation declares this form as a bookmarkable page that
 * can be transitioned to by other pages of this application. Further the
 * specified role (DefaultPage.class) make this page appear by default when the
 * application is started.
 */
@Page(role = DefaultPage.class)
@Templated("Login.html#app-template")
public class Login extends Composite {

  /**
   * Errai's data binding module will automatically bind the injected instance
   * of {@link UserComplaint} to all fields annotated with {@link Bound}. If not
   * specified otherwise, the bindings occur based on matching field names (e.g.
   * userComplaint.name will automatically be kept in sync with the data-field
   * "name")
   */


 @Inject
  private TransitionTo<Dashboard> dashboardPage;

  @Inject
  @Bound
  @DataField
  @NotBlank
  @NotEmpty
  private TextBox username;

  @Inject
  @Bound
  @DataField
  private PasswordTextBox password;
  
  @Inject
  @DataField
  private TransitionAnchor<Forgotpassword> forgotpassword;
  
  @Inject
  @DataField
  private TransitionAnchor<Register> register;
  
  @Inject
  @DataField
  private Button submit;

  /**
   * Errai's JAX-RS module generates a stub class that makes AJAX calls back to
   * the server for each resource method on the {@link UserComplaintEndpoint}
   * interface. The paths and HTTP methods for the AJAX calls are determined
   * automatically based on the JAX-RS annotations ({@code @Path}, {@code @GET},
   * {@code @POST}, and so on) on the resource.
   */
  @Inject
  private Caller<LoginEndpoint> endpoint;

  @Inject
  @Model
  private User user;

  /**
   * This method is registered as an event handler for click events on the
   * submit button of the complaint form.
   * 
   * @param e
   *          the click event.
   */
  @EventHandler("submit")
  private void onSubmit(ClickEvent e) {
    // Execute the REST call to store the complaint on the server
    endpoint.call(new ResponseCallback() {
      @Override
      public void callback(Response response) {
        if (response.getStatusCode() == Response.SC_CREATED) {
          // Navigate to the "ComplaintSubmitted" page after we received a
          // response from the server.
        	dashboardPage.go();
        }
      }
    }).login(user);
  }


}