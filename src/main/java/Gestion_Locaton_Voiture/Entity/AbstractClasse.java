package Gestion_Locaton_Voiture.Entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)

public class AbstractClasse  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(name = "date_creation",nullable = false)

@CreationTimestamp
private Date dateCreation;
@LastModifiedDate
@Column(name = "LastModifierDate")
@JsonIgnore
private Instant ModifierDate;

}
