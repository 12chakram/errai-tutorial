package org.jboss.errai.demo.client.shared;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Version;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;

/**
 * This is a JPA entity representing a user complaint. It is used on both the
 * server and the client. On the server, it is persisted into the relational
 * database that is configured as data source in META-INF/persistence.xml. On
 * the client, it is persisted into the browser's offline storage.
 */
@Entity
@Bindable
@Portable
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Version
  private Long version;

  private String username;
  private String password;
  
  

  public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getVersion() {
	return version;
}

public void setVersion(Long version) {
	this.version = version;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    User other = (User) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    }
    else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", version=" + version + ", username=" + username + ", password=" + password + ",]";
  }

}
