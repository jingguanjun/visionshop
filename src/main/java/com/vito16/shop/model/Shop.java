package com.vito16.shop.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Shop {
	private static final long serialVersionUID = 1L;

	/**
	 * 数据序号
	 */
	private Integer id;
	
	private User ownUser;
	
	private String name;
	
	private String describe;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne
    @JoinColumn
	public User getOwnUser() {
		return ownUser;
	}

	public void setOwnUser(User ownUser) {
		this.ownUser = ownUser;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	
}
