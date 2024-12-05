package thread;

import java.awt.*;

//메인 스레드만 이용한 경우
public class BeepPrintExample1 {
    public static void main(String[] args) {
        //Java에서 GUI(Graphics User Interface) 관련 작업을 도와주는 클래스
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //싱글톤 패턴, 시스템(운영체제)에 맞는 기본 Toolkit 구현체를 반환
        for(int i = 0; i<5; i++) { //이 루프 먼저 수행
            toolkit.beep(); //띵 소리를 냄
            try { Thread.sleep(500); } catch (Exception e) {}

        }

        for(int i = 0; i<5; i++) { //앞 루프 수행 후 수행
            System.out.println("띵");
            try { Thread.sleep(500);  //0.5(500ms)초 동안 대기
            } catch (Exception e) {}
        }
    }
}
