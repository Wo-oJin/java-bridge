### 게임 사용자 시나리오 ###
1. 게임 문구 출력
2. 다리의 길이를 입력(3~20)
3. 이동할 칸을 선택(U,D)
4. 다리 건너기 실패 시 R, Q 중 1개를 눌러 계속 진행
4.1. R 누를 시 3으로 돌아가 다시 게임 시작
4.2  Q 누를 시 게임 종료
5. 총 시도한 게임 회수를 확인

### 시나리오 도출 기능 ###

#### 1.  게임 세팅(게임 문구까지 출력)
 > 필요한 도메인 생성 및 게임 문구 출력

#### 2.  다리의 길이를 입력받는 기능 및 검증
  
  > 2.1 정수값을 입력했는지 확인</br>
  > 2.2 다리의 길이가 3~20을 벗어나는지 확인


#### 3. 컴퓨터가 랜덤 값을 생성하는 기능
</br>

#### 4. 이동할 칸을 선택하는 기능 및 검증

  > 4.1 문자를 입력했는지 확인</br>
  > 4.2 문자의 종류가 R, Q 둘 중 하나인지 확인
</br>
  
#### 5. 사용자가 입력한 칸과 랜덤으로 생성한 칸이 틀린지 확인하는 기능
</br>

#### 6.  R을 누를 시 3으로 돌아가 다시 게임을 시작하며, Q를 누를 시 게임을 종료하는 기능
</br>

#### 7.  종료 시 게임 횟수를 출력하는 기능 
