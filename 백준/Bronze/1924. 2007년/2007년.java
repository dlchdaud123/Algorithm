import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int days = 0;
    // 월 차를 이용해서 일수 구하기
    // 일 차를 이용해서 일수 구하기
    // 일 수를 7로 나눈 나머지를 이용해서 요일 알아내기

      for(int i = 0; i < x; i++){
        days += month[i];
      }
      
      days += y-1;

    String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    System.out.print(week[days % 7]);
  }
}