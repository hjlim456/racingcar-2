# 💪 프로젝트 개요

자동차 경주 게임을 구현한다.
자동차의 `이름`과 `시도 횟수`를 입력하면, 자동차를 `랜덤`하게 전진시킨 후 우승자를 선정한다.

# 📝 구현 기능 목록

## 입력(2가지)

### 1. 자동차 이름을 입력하는 기능

- [ ] `경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)` 문구를 출력한다.
- [ ] 자동차의 이름을 입력받는다.
    - [ ] `검증` : 빈 문자열이 아님을 검증한다.
    - [ ] `검증` : 올바른 구분자로 구분되었음을 검증한다.
    - [ ] `검증` : 중복되는 이름이 없음을 검증한다.
    - [ ] `검증` : 5자 이하의 이름인지 검증한다.

### 2. 시도 횟수 입력하는 기능

- [ ] `시도 횟수는 몇회인가요?` 문구를 출력한다.
- [ ] 시도횟수를 입력받는다.
    - [ ] `검증` : 빈 문자열이 아님을 검증한다.
    - [ ] `검증` : 1이상의 숫자인지 검증한다.

---

## 출력(2가지)

### 1. 각 차수별 실행결과를 출력하는 기능

- [ ] 첫 회차때만 `실행결과` 를 출력한다.
- [ ] `%{차이름} : -- ` (전진상태표시 기호) 포맷으로 출력

### 2. 우승자를 출력하는 기능

- [ ] 가장 많이 이동한 자동차를 선정한다.
- [ ] `최종 우승자 : pobi, dodo` 포맷으로 출력(", "로 구분)

---

## 비즈니스 로직(1가지)

### 1. 자동차 전진 기능

- [ ] `시도횟수` 만큼 전진을 시도한다.
- [ ] 0~9중에서 난수를 생성한다
- [ ] 전진 조건에 부합할떄만 전진한다.
