import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.imageio.IOException;

public class Main {
    public static void main(String[] args) throws IOExcepion {
        // 1. Scanner, 2. BufferReader....
        // >> Scanner 의 경우는 Byte 단위로 불러와서 읽음, 자주 쓰는 데이터 포맷 사용이 중요
        /*
         * UTF-8 의 경우 문자의 영역에 따라 Byte 사용 개수가 다른데, 영어의 경우 1Byte, 한글의 경우 3Byte 를 사용
         * UTF-16 은 거의 모든 문자가 2Byte 로 구성
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(a - b);
    }
}
