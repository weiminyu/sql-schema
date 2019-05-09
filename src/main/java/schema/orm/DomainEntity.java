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
  private String tld;

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

  public static DomainEntity create(String eppRepoId, String fullyQualifiedDomainName) {
    DomainEntity domainEntity = new DomainEntity();
    domainEntity.setEppRepoId(eppRepoId);
    domainEntity.setFullyQualifiedDomainName(fullyQualifiedDomainName);
    return domainEntity;
  }

  public String getTld() {
    return tld;
  }

  public void setTld(String tld) {
    this.tld = tld;
  }
}
