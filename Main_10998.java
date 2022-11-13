import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10998 {
    public static void main(String[] args) throws IOException {
        // 1. Scanner, 2. BufferReader....
        // >> Scanner 의 경우는 Byte 단위로 불러와서 읽음, 자주 쓰는 데이터 포맷 사용이 중요
        /*
         * UTF-8 의 경우 문자의 영역에 따라 Byte 사용 개수가 다른데, 영어의 경우 1Byte, 한글의 경우 3Byte 를 사용
         * UTF-16 은 거의 모든 문자가 2Byte 로 구성
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // read는 byte 단위로 데이터를 불러옴 ~ int
        // readLine 은 한 줄로만 읽으니까 배열이 될 수 없음
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(a * b);
    }
}
