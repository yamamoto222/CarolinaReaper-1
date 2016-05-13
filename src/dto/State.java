package dto;

//stateテーブル

import java.io.Serializable;


public class State implements Serializable{

	private Integer stateId; //状態ID
	private String state;	 //参加・不参加・未定



	public State(){}

	public Integer getStateId(){
		return stateId;
	}

	public void setStateId(Integer stateId){
		this.stateId = stateId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


}
