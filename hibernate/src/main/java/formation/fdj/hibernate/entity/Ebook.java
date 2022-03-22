package formation.fdj.hibernate.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("ebook")
@PrimaryKeyJoinColumn(name= "ebook_id")
public class Ebook extends Book{
}
