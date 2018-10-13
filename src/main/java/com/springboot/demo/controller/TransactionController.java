/**
 * Project Name:SpringBootTest1
 * File Name:TransactionController.java
 * Package Name:com.springboot.demo.controller
 * Date:2018年9月14日上午10:09:23
 * Copyright (c) 2018, summer.zhang@clpsglobal.com All Rights Reserved.
 *
 */
package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.pojo.Transaction;
import com.springboot.demo.service.TransactionService;

/**
 * ClassName: TransactionController <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 * date: 2018年9月14日 上午10:09:23 <br/>
 *
 * @author summer.zhang
 * @version V1.0
 * @since JDK 1.8
 */
@RestController
@CrossOrigin
public class TransactionController {
	@Autowired
	private TransactionService transactionService;

	// 查询所有pending approval
	@GetMapping(value = "/trac/{status}")
	public List<Transaction> queryPendingApprovalList(@PathVariable Integer status) {
		status = 0;
		List<Transaction> list = transactionService.queryPendingApprovalAndHistoryByStatus(status);
		return list;
	}

	// 修改状态
	@PutMapping(value = "/trac/{id}")
	public Transaction updateStatus(@RequestBody Transaction transaction, @PathVariable Integer id) {
		transaction.setId(id);
		transaction.setStatus(1);
		transaction = transactionService.updateTranPendingApproByStatus(transaction);
		return transaction;
	}

	// 查询所有pending approval
	@GetMapping(value = "/tracByStatus/{status}")
	public List<Transaction> queryHistoryList(@PathVariable Integer status) {
		status = 1;
		List<Transaction> list = transactionService.queryPendingApprovalAndHistoryByStatus(status);
		return list;
	}

	// 根据Id查询
	@GetMapping(value = "/tracById/{id}")
	public Transaction queryTransactionById(@PathVariable Integer id) {
		Transaction transaction = transactionService.queryTransactionById(id);
		return transaction;
	}

}
