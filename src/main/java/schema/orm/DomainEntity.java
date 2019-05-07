package schema.orm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** ORM entity model for DNS domain. */
@Entity
@Table(name = "domain")
public class DomainEntity {
  private String eppRepoId;
  private String fullyQualifiedDomainName;

  /** Default constructor required by Hibernate. */
  DomainEntity() {}

  @Id
  public String getEppRepoId() {
    return eppRepoId;
  }

  public void setEppRepoId(String eppRepoId) {
    this.eppRepoId = eppRepoId;
  }

  public String getFullyQualifiedDomainName() {
    return fullyQualifiedDomainName;
  }

  public void setFullyQualifiedDomainName(String fullyQualifiedDomainName) {
    this.fullyQualifiedDomainName = fullyQualifiedDomainName;
  }
}
