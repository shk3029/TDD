package me.js;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/*
클래스 이름 : Account
기능은 세 가지
 * 잔고 조회
 * 입금
 * 출금
→ 금액은 원 단위로(예: 천원 = 1000)

 */
public class AccountTest {
	@Test
	public void 계좌생성() {
		Account account = new Account(10000);
		assertEquals("10000원으로 계좌 생성 후 잔고 조회",10000, account.getBalance());
	}

	@Test
	public void 잔고조회() {
		//  테스트 시나리오 : 10000원으로 계좌 생성 -> 잔고 조회 결과 일치
		Account account = new Account(10000);
		if(account.getBalance() != 10000) {
			fail();
		}
		account = new Account(50);
		if(account.getBalance() != 50) {
			fail();
		}
	}
}














