package com.dianrong.common.uniauth.common.bean.dto;

import java.util.Date;
import java.util.List;

public class GroupDto {
	private Integer id;
	private String code;
	private String name;
	private Date createDate;
	private Date lastUpdate;
	private Byte status;
	private String description;

	/**
	private List<UserDto> ownerList;
	**/
	private List<UserDto> userList;
	private List<GroupDto> groupList;
	
	//whether this group connected with a role
	private Boolean roleChecked;

	public Boolean getRoleChecked() {
		return roleChecked;
	}

	public GroupDto setRoleChecked(Boolean roleChecked) {
		this.roleChecked = roleChecked;
		return this;
	}

	/**
	public List<UserDto> getOwnerList() {
		return ownerList;
	}

	public void setOwnerList(List<UserDto> ownerList) {
		this.ownerList = ownerList;
	}
	**/

	public List<GroupDto> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<GroupDto> groupList) {
		this.groupList = groupList;
	}

	public List<UserDto> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDto> userList) {
		this.userList = userList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public GroupDto setDescription(String description) {
		this.description = description;
		return this;
	}

	public Byte getStatus() {
		return status;
	}

	public GroupDto setStatus(Byte status) {
		this.status = status;
		return this;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public GroupDto setCreateDate(Date createDate) {
		this.createDate = createDate;
		return this;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public GroupDto setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}
}