package dto;

//Flagテーブル

import java.io.Serializable;


public class Flag implements Serializable{

	private Integer flagId;
	private String flag;



	public Integer getFlagId() {
		return flagId;
	}
	public void setFlagId(Integer flagId) {
		this.flagId = flagId;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

}
