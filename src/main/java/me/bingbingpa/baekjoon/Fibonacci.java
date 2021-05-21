package me.bingbingpa.baekjoon;

public class Fibonacci {
    private static long[] fibo;
    public static void main(String[] args) {
        fibo = new long[51];
        System.out.println("result ============ " + solution(50)); // output: 12586269025
    }

    /**
     * TODO n 이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
     * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
     * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
     * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
     * 입력조건: 첫째 줄에 n이 주어진다. n은 45보다 작거나 같은 자연수이다.
     * 출럭: 첫째 줄에 n번째 피보나치 수를 출력한다.
     */
    public static long solution(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        if (fibo[num] != 0) {
            return fibo[num];
        }
        fibo[num] = solution(num - 1) + solution(num - 2);

        return fibo[num];
    }
}
