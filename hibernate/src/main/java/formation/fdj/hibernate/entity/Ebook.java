package formation.fdj.hibernate.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ebook")
public class Ebook extends Book{
}
