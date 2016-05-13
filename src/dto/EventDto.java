package dto;

//イベントテーブル

import java.io.Serializable;
import java.util.Calendar;

public class EventDto implements Serializable{

	private Integer eventId; //イベントID
	private String eventName; //イベント名
	private String organizerName; //幹事名
	private String eventVenve; //イベント会場
	private Calendar registDay; //投稿日時
	private String autherName; //イベント作成者
	private String autherPass; //イベント作成者パスワード
	private Calendar deadlineDay; //締切日
	private String autherRemark; //イベント製作者の備考
	private Calendar daterminedDay; //候補日
	private Integer datermindFlag; //確定日時
	private Integer eventOpenFlag; //イベントの公開フラグ.1:公開,0:非公開
	private Integer numberOfEvent; //イベント会数
	private String eventUrl; //URL
	private String eventPageFileName; //イベントページファイルの名前
	private Integer pricePerPerson; //イベント一人当たりの料金
	private Integer flagId; //flagのIDですよー



	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getOrganizerName() {
		return organizerName;
	}
	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}
	public String getEventVenve() {
		return eventVenve;
	}
	public void setEventVenve(String eventVenve) {
		this.eventVenve = eventVenve;
	}
	public Calendar getRegistDay() {
		return registDay;
	}
	public void setRegistDay(Calendar registDay) {
		this.registDay = registDay;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	public String getAutherPass() {
		return autherPass;
	}
	public void setAutherPass(String autherPass) {
		this.autherPass = autherPass;
	}
	public Calendar getDeadlineDay() {
		return deadlineDay;
	}
	public void setDeadlineDay(Calendar deadlineDay) {
		this.deadlineDay = deadlineDay;
	}
	public String getAutherRemark() {
		return autherRemark;
	}
	public void setAutherRemark(String autherRemark) {
		this.autherRemark = autherRemark;
	}
	public Calendar getDaterminedDay() {
		return daterminedDay;
	}
	public void setDaterminedDay(Calendar daterminedDay) {
		this.daterminedDay = daterminedDay;
	}
	public Integer getDatermindFlag() {
		return datermindFlag;
	}
	public void setDatermindFlag(Integer datermindFlag) {
		this.datermindFlag = datermindFlag;
	}
	public Integer getEventOpenFlag() {
		return eventOpenFlag;
	}
	public void setEventOpenFlag(Integer eventOpenFlag) {
		this.eventOpenFlag = eventOpenFlag;
	}
	public Integer getNumberOfEvent() {
		return numberOfEvent;
	}
	public void setNumberOfEvent(Integer numberOfEvent) {
		this.numberOfEvent = numberOfEvent;
	}
	public String getEventUrl() {
		return eventUrl;
	}
	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}
	public String getEventPageFileName() {
		return eventPageFileName;
	}
	public void setEventPageFileName(String eventPageFileName) {
		this.eventPageFileName = eventPageFileName;
	}
	public Integer getPricePerPerson() {
		return pricePerPerson;
	}
	public void setPricePerPerson(Integer pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
	}
	public Integer getFlagId() {
		return flagId;
	}
	public void setFlagId(Integer flagId) {
		this.flagId = flagId;
	}


}