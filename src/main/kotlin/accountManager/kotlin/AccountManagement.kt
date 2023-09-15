package accountManager.kotlin

import java.lang.NumberFormatException

class Account(var account: Int, var balance: Double) {

}


object AccountManagement {
    val accountList = mutableListOf<Account>()


    fun run() {
        while (true) {
            println("\n=== 계좌 관리 프로그램")
            println("1. 계좌 추가")
            println("2. 계좌 목옥 조회")
            println("3. 입금")
            println("4. 출금")
            println("5. 송금")
            println("6. 출금")
            println("7. 원하시는 서비스를 선택해주세요:")
            println("0. 종료")
            var choice = readln().toInt()
            try {
                when (choice) {

                    0 -> {
                        print("종료 합니다.") }

                    1 -> {
                        print("계좌번호:")
                        val accountNumber = readln().toInt()
                        print("잔액:")
                        val balance = readln().toDouble()
                        val account = Account(accountNumber, balance,)
                    }

                    2 -> {
                        accountList.forEach { account ->
                            print("계좌번호: ${account.account},잔액: ${account.balance}")
                        }
                    }

                    3 -> {
                        print("계좌번호")
                        val accountNumber = readln().toInt()
                        print("입금액:")
                        val balance = readln().toDouble()
                    }

                    4 -> { "출금" }

                    5 -> { "송금" }

                    6 -> { "원하는기능을 선택하세요" }
                    else -> {
                        print("입력번호를 확인해주세요.")
                        continue
                    }
                }
            } catch (e : NumberFormatException) {

            }

            }
        }
    }






//...
// 추가적으로 5번에 계좌이체
// 보낼계좌(from), 받는계좌(to), 보낼금액(amount)
// 로직:
// from의 balance를 amount만큼 감소,
// to의 balcnce를 amount만큼 증가
