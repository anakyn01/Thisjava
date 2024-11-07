package collection.map;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LifoFifo {

	public static void main(String[] args) {
		//stack 컬렉션 생성
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전 넣기
		coinBox.push(new Coin(100));//1
		coinBox.push(new Coin(50));//2
		coinBox.push(new Coin(500));//3
		coinBox.push(new Coin(10));//4
		
		//동전을 하나씩 꺼내기
		while(!coinBox.isEmpty()) {//비어 있지 않다면 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue()+"원");
		}
		
		//Queue => 선입선출
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메세지 넣기
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","이동현"));
		messageQueue.offer(new Message("sendkakaotalk","전세찬"));
		
		//메시지를 하나씩 꺼내어 처리 while
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendkakaotalk":
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			}
		}

	}

}


/*
LIFO(Last in First Out[후입선출]) => 나중에 넣은 객체가 먼저 빠져나가는 구조
Stack => Stack<E> stack = new Stack<E>()

method 
push(E item) : 주어진 객체를 스택에 넣는다
pop() : 스텍의 맨위 객체를 꺼낸다

FIFO(First in First Out[선입 선출]) => 먼저 넣은 객체가 먼저 빠져나가는 구조
Queue 
Queue<E> queue = new LinkedList<E>()

method 
offer(E e) : 주어진 객체를 큐에 넣는다
poll() : 큐에서 객체를 빼낸다

앞전 예제에서 내림차순으로 만들려면 desc를 사용했어야 합니다
그러나 Stack을 사용한다 면 ...
*/