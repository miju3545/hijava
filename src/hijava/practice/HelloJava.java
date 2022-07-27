package hijava.practice;

/**
 * 첫번째 자바 실습
 *
 * @author miju
 * @update say 함수 추가 (2022-07-27 by miju)
 */

// 메모리 > JVM > HelloJava
public class HelloJava { //실행 => 메모리에 JVM 환경 생성

    public static void main(String[] args) { //메모리 안에 JVM(실행환경) 이 구동될 때 생기는 것이 main
        String ret = HelloJava.say("Hello, Java"); //thread(메소드 찾고 인수 입력), 실행 시 메모리 주소가 링크됨.
        //JVM 이 스스로 화면에 출력

        System.out.println(ret);
    }

    public static String say(String msg) {
        return msg;


    }
}










