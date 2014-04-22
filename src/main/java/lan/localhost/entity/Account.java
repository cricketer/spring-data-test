package lan.localhost.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@SuppressWarnings("serial")
@Table(name = "user_account")
public class Account implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name", length = 255, nullable = false, unique = true)
	private String name;

	@Column(name = "password", length = 128, nullable = false)
	private String password;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "account")
	private List<EventAccountRelation> events;

	public Account() {
		super();
		name = "";
		password = "";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<EventAccountRelation> getEvents() {
		return events;
	}

	public void setEvents(List<EventAccountRelation> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.appendSuper(super.toString())
				.append("id", id)
				.append("name", name)
				.toString();
	}

}
