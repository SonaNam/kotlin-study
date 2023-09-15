package ch09

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDateTime

// 프로세스: 실행중인 프로그램
// ( 프로그램을 실행해서 메모리에 올라가는 것)
// 스레드: 프로세스의 실행단위를 나눈 것
// 컨텍스트: 다중 작업을 싱글스레드 처리하기 위한 기법(시간분할)
// ------------
// 코루틴: 스레드가 기본적으로 리소스소모가 많기 때문에, 좀 더 작은 단위로 나눈 것
// ------------
// 동시에 여러개의 작업을 처리하기 위한방법

// 1작업시작 -> 1작업끝 -> 2번작업시작 ->2번작업끝
// 1번작업의 완료가 2번작업에 영향 미침(의존성관계) 1의값이 2에 영향을 미칠경우

//1번작업 시작 ->끝
//2번작업 시작 ->끝
//1/2번 작업간에는 의존관계가 없음
//나눠서 처리한 작업의 결과를 UI에서 보여주거나,
// 결과를 저장하거나 이럴땐 한번에 보여줘야함

// a사람이 첫번째 API호출 - thread 1
// a사람이 두번째 API호출 - thread 2
// b사람이 세번째 API호출 - thread 3
// 스프링MVC - 스레드풀을 500
fun main()

{
    val start = LocalDateTime.now()

    runBlocking {
        // 코루틴을 실행

        launch {
            delay(1000L)
        }
        launch {
            delay(1000L)
        }
        launch {
            delay(1000L)
        }

            println("runBlocking - ${Thread.currentThread().name}")
    }
    val end = LocalDateTime.now()
}
