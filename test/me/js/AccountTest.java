package me.js;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/*
클래스 이름 : Account
기능은 세 가지
 * 잔고 조회
 	- 10000원으로 계좌 생성
 	- 잔고 조회 결과 일치
 * 입금
 	- 10000원으로 계좌 생성
 	- 1000원 입금
 	- 잔고 11000원 확인
 * 출금
 	- 10000원으로 계좌 생성
 	- 1000원 출금
 	- 잔고 9000원 확인
→ 금액은 원 단위로(예: 천원 = 1000)

 */
public class AccountTest {

	private final Account account = new Account(10000);

	@Test
	public void 계좌생성() {
		assertEquals("10000원으로 계좌 생성 후 잔고 조회",10000, account.getBalance());
	}

	/*
	 * 잔고 조회
		- 10000원으로 계좌 생성
		- 잔고 조회 결과 일치
	 */
	@Test
	public void 잔고조회() {
		Account account = new Account(10000);
		if(account.getBalance() != 10000) {
			assertEquals(10000, account.getBalance());
		}
		account = new Account(50);
		if(account.getBalance() != 50) {
			assertEquals(10000, account.getBalance());
		}
	}

	/*  입금
		- 10000원으로 계좌 생성
		- 1000원 입금
		- 잔고 11000원 확인
	 */
	@Test
	public void 입금() {
		Account account = new Account(10000);
		account.deposit(1000);
		assertEquals("10000원에서 1000원 입금하면 11000원", 11000, account.getBalance());
	}

	/* 출금
		- 10000원으로 계좌 생성
		- 1000원 출금
		- 잔고 9000원 확인
	 */
	@Test
	public void 출금() {
		Account account = new Account(10000);
		account.withdraw(1000);
		assertEquals("10000원에서 1000원 출금 -> 9000원", 9000, account.getBalance());
	}
}














