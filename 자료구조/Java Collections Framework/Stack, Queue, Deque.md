# Stack, Queue, Deque

![](https://ifh.cc/g/VtGG8d.png)

- Stack은 Class
- Queue 와 Deque 는 Interface → 대표적으로 LinkedList 가 구현함.
- Stack은 어디에 사용??
    - Do / Undo 기능 : 컴퓨터로 수행하는 작업들을 하나 하나씩 Stack에 저장했다가 되돌리기 할 때마다 Stack에서 pop해서 방금 전에 수행했던 명령을 취소하는 방식
    - Screen Stack : 뒤로가기를 누르면 한 화면 씩 이전에 봤던 화면을 보게되는 것
- Queue는 어디에 사용??
    - Event Queue : 우리가 키보드를 타이핑 하거나, 마우스를 움직이거나, 화면을 클릭하고 프로그램을 수행할 때 이러한 모든 동작을 컴퓨터에서는 이벤트로 전달함. 그럼 운영체제는 이런 이벤트들을 계속 모아두었다가 순서대로 수행함. 이것을 Event Queue라고 함. 컴퓨터가 일시적으로 동작을 멈추는 현상을 보통 Lack 걸렸다고 하는데, 시간이 지나면 우리가 클릭하거나 타이핑 했던 것들이 한꺼번에 수행되는 것이 바로 이벤트들이 Queue에 쌓여 있다가 한꺼번에 순서대로 수행되는 현상임.
