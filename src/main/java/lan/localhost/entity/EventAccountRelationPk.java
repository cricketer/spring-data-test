package lan.localhost.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Embeddable
@SuppressWarnings("serial")
public class EventAccountRelationPk implements Serializable {

	private Long eventId;

	private Long accountId;

	public EventAccountRelationPk() {
		super();
	}

	public EventAccountRelationPk(Long eventId, Long accountId) {
		super();
		this.eventId = eventId;
		this.accountId = accountId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
