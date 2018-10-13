/**
 * Project Name:SpringBootTest1
 * File Name:Transaction.java
 * Package Name:com.springboot.demo.pojo
 * Date:2018年9月14日上午9:41:58
 * Copyright (c) 2018, summer.zhang@clpsglobal.com All Rights Reserved.
 *
 */
package com.springboot.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * ClassName: Transaction <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 * date: 2018年9月14日 上午9:41:58 <br/>
 *
 * @author summer.zhang
 * @version V1.0
 * @since JDK 1.8
 */
@Entity
public class Transaction {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer status;
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", status=" + status + ", description=" + description + "]";
	}

}
