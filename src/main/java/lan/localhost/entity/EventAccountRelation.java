package lan.localhost.entity;

import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@SuppressWarnings("serial")
@Table(name = "event_account_rel")
public class EventAccountRelation implements Serializable {

	@EmbeddedId
	private EventAccountRelationPk primaryKey;

	@MapsId("eventId")
	@ManyToOne(optional = false)
	@JoinColumn(name = "event_id", nullable = false, updatable = false)
	private Event event;

	@MapsId("accountId")
	@ManyToOne(optional = false)
	@JoinColumn(name = "account_id", nullable = false, updatable = false)
	private Account account;

	@Column(name = "moderator", nullable = false)
	private Boolean moderator = Boolean.FALSE;

	public EventAccountRelation() {
		super();
	}

	public EventAccountRelation(Event event, Account account) {
		super();
		this.event = event;
		this.account = account;
	}

	public EventAccountRelationPk getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(EventAccountRelationPk primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Boolean getModerator() {
		return moderator;
	}

	public void setModerator(Boolean moderator) {
		this.moderator = moderator;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
			.appendSuper(super.toString())
			.append("primaryKey", primaryKey)
			.append("moderator", moderator)
			.toString();
	}

}
