package AnimalService.domain;


import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "animal", schema = "public")

@Data
@EqualsAndHashCode(of = "Id", callSuper = false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Animal  implements Serializable{
	
	public Long getId() {
		return animalId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", length = 22, nullable = false)
	private Long animalId;
	
	@Column(name = "CRE_DT", nullable = false)
	@CreatedDate
	private Date createDate;

	@Column(name = "UPD_DT", nullable = false)
	@LastModifiedDate
	private Date updateDate;
	
	@Column(name = "TYPE", length = 22)
	private String type;

    @Column(name = "BREED", length = 22)
    private String breed;

    @Column(name = "NAME",length = 22)
    private String name;

    @Column(name = "COLOR", length = 22)
    private String color;
    
    
	
}
