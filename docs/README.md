## 숫자야구를 위한 클래스

# 기능

- 메인함수
    - 랜덤한 3자리수를 뽑아 게임시작
    - 게임 시작
        - 입력받은 사용자 수 ArrayList로 변경
            - ArrayList에 넣기 위해 Integer형으로 변경
            - 입력받은 수가 3자리 수가 아니면 오류 출력
            - 같은 인덱스에 있는 수가 같은지 확인 --> 스트라이크
                - 수가 같으면 스트라이크 += 1
            - 컴퓨터 인덱스와 유저 인덱스를 돌면서 수가 같은지 확인 --> 볼
                - 인덱스가 다르고 수가 같으면 볼 += 1
            - 볼, 스트라이크 순서로 출력 - 만약 둘다 0이면 낫싱 출력
            - 스트라이크가 3이면 문구 출력
                - 볼과 스트라이크 0으로 초기화
                    - 컴퓨터 숫자와 유저숫자 초기화
                    - 1과 2를 입력받아 게임을 진행할지 끝낼지 결정


- main
    - createRandomNumber() O
    - gameStart() O
        - changeUserNumber() O
            - parseToInteger()
            - checkError()
            - checkStrike()
                - countStrike()
            - checkBall()
                - countBall()
            - printResult()
            - checkAnswer()
                - resetBallStrike()
                    - resetUserComputerNumber()
                    - restart()

-기능

- 랜덤숫자 생성 클래스
    - createRandomNumber()
- 게임시작 클래스
    - gameStart()
- 검사 클래스
    - checkError()
    - checkStrike()
    - checkBall()
    - checkAnswer()
- 카운트 클래스
    - countStrike()
    - countBall()
- 재시작 클래스
    - restart()
    - resetUserComputerNumber()
    - resetBallStrike()
- 결과출력 클래스
    - printResult()
- 숫자 변경 클래스
    - changeUserNumber()
    - parseToInteger()
  
@version 1.01 04/07/23
@author 허준기
