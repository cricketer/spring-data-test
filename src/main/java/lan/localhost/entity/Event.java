package lan.localhost.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "meeting")
@SuppressWarnings("serial")
public class Event implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "title", length = 255, nullable = false, unique = true)
	private String title;

	@Column(name = "location", length = 255, nullable = false)
	private String location;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "event")
	private List<EventAccountRelation> accounts;

	public Event() {
		super();
		title = "";
		location = "";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<EventAccountRelation> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<EventAccountRelation> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.appendSuper(super.toString())
				.append("id", id)
				.append("title", title)
				.append("location", location)
				.toString();
	}

}
