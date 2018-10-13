/**
 * Project Name:SpringBootTest1
 * File Name:TransactionRepository.java
 * Package Name:com.springboot.repository
 * Date:2018年9月14日上午9:46:41
 * Copyright (c) 2018, summer.zhang@clpsglobal.com All Rights Reserved.
 *
 */
package com.springboot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.pojo.Transaction;

/**
 * ClassName: TransactionRepository <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 * date: 2018年9月14日 上午9:46:41 <br/>
 *
 * @author summer.zhang
 * @version V1.0
 * @since JDK 1.8
 */
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	public Transaction queryTransactionById(Integer id);

	// public Transaction updateTranPendingApproByStatus(Integer status);

	public List<Transaction> queryPendingApprovalAndHistoryByStatus(Integer status);
}
