package fr.parshimipopeli.gestion.de.stock.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public class AbstactEntity implements Serializable {
    @Id
    private Long id;

    @CreatedDate
    private Date creationDate;

    @LastModifiedDate
    private Date lastUpdateDate;

}
