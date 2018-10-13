/**
 * Project Name:SpringBootTest1
 * File Name:TransactionService.java
 * Package Name:com.springboot.demo.service
 * Date:2018年9月14日上午9:59:23
 * Copyright (c) 2018, summer.zhang@clpsglobal.com All Rights Reserved.
 *
 */
package com.springboot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.pojo.Transaction;
import com.springboot.demo.repository.TransactionRepository;

/**
 * ClassName: TransactionService <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 * date: 2018年9月14日 上午9:59:23 <br/>
 *
 * @author summer.zhang
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;

	// 查询所有pending approval或history
	public List<Transaction> queryPendingApprovalAndHistoryByStatus(Integer status) {
		List<Transaction> list = transactionRepository.queryPendingApprovalAndHistoryByStatus(status);
		return list;
	}

	// 根据Id查询
	public Transaction queryTransactionById(Integer id) {
		Transaction transaction = transactionRepository.queryTransactionById(id);
		return transaction;
	}

	// 修改交易状态
	public Transaction updateTranPendingApproByStatus(Transaction transaction) {
		transaction = transactionRepository.save(transaction);
		return transaction;
	}
}
