import java.util.Date;
import java.util.List;

public class Message {
	private User user;
	private enum typeOfMessage{
		INCOMING, 
		OUTGOING
	}
	private List<Message> data;
	private Date date;
	
	public Message(User user, List<Message> data, Date date) {
		this.user = user;
		this.data = data;
		this.date = date;	
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Message> getData() {
		return data;
	}

	public void setData(List<Message> data) {
		this.data = data;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}

