# Sample code for Programming (2) class, ITE @ INU
- Instructor: Prof. Youngpil Kim

## MonsterRaidEx.java
- Concrete class
  - 공통
    - 각 생성자는 name을 인수로 전달 받아, 필드로 설정하고, HP는 100으로 초기화
  - WarriorClass 클래스 - Warrior 추상 클래스를 상속
    - 생성자에 aggro를 0으로 초기화 코드 추가
  - defend(damage) 구현
    -  "OOO 이/가 막았다." 메시지 출력 후, HP를 damage * damageReductionRatio 만큼 감소시킴 (최소 0)
  - attack() 구현
    - "OOO 이/가 공격했다." 메시지 출력 후, aggro를 0.1만큼 증가 시킴 (최대 100)
  - WizardClass 클래스 – Wizard 추상 클래스를 상속
    - 생성자에 MP는 100, cooltime은 0, cost는 10으로 초기화
  - cast() 구현
    - MP가 0보다 크면, "OOO 이/가 시전했다." 메시지 출력 후, MP 를 cost만큼 감소. (최소 0)
    - MP 0이면, “마나부족” 메시지 출력
