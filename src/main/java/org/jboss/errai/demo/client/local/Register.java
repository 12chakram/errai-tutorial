package org.jboss.errai.demo.client.local;

import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

/**
 * The companion Java class of the ComplaintSubmitted template. It represents a
 * simple page that is displayed (transitioned to) after a complaint has been
 * submitted successfully.
 */
@Page
@Templated("Register.html#app-template")
public class Register extends Composite {
	  
	  @Inject
	  @AutoBound
	  @DataField
	  private TextBox reg_email;
	  
	  @Inject
	  @AutoBound
	  @DataField
	  private TextBox reg_username;
	  
	  @Inject
	  @AutoBound
	  @DataField
	  private PasswordTextBox reg_password;
	  
	  @Inject
	  @AutoBound
	  @DataField
	  private PasswordTextBox reg_cnf_password;
	  
	  @Inject
	  @AutoBound
	  @DataField
	  private CheckBox reg_accept;
	  
	  
	  @Inject
	  @DataField
	  private Button submit;
	  
	  @Inject
	  @DataField
	  private Button reset;
	  
	  
	  @EventHandler("submit")
	  private void onSubmit(ClickEvent e) {
		  System.out.println("submit button clicked");
	  }
	  
	  @EventHandler("reset")
	  private void onClick(ClickEvent e) {
		 System.out.println("Reset button clicked");
	  }
	  
	  
	  @Inject
	  @DataField
	  private TransitionAnchor<Login> login;
	  
	  
 
}
