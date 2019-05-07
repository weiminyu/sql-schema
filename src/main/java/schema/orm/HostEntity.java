package schema.orm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** ORM entity model for DNS host. */
@Entity
@Table(name = "host")
public class HostEntity {
  private String eppRepoId;
  private String fullyQualifiedHostName;

  /** Default constructor for Hibernate. */
  HostEntity() {}

  @Id
  public String getEppRepoId() {
    return eppRepoId;
  }

  public void setEppRepoId(String eppRepoId) {
    this.eppRepoId = eppRepoId;
  }

  public String getFullyQualifiedHostName() {
    return fullyQualifiedHostName;
  }

  public void setFullyQualifiedHostName(String fullyQualifiedHostName) {
    this.fullyQualifiedHostName = fullyQualifiedHostName;
  }
}
