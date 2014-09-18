package org.jboss.errai.demo.client.local;

import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;

/**
 * The companion Java class of the ComplaintSubmitted template. It represents a
 * simple page that is displayed (transitioned to) after a complaint has been
 * submitted successfully.
 */
@Page
@Templated("Forgotpassword.html#app-template")
public class Forgotpassword extends Composite {
	
	@Inject
    @AutoBound
	@DataField
	private TextBox retrieve_email;
	
	@Inject
	@DataField
	private Button submit;
	
	
	  @EventHandler("submit")
	  private void onSubmit(ClickEvent e) {
		  System.out.println("Hiiiiii...");
	  }
  
	  @Inject
	  @DataField
	  private TransitionAnchor<Login> login;
 
}
