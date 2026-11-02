/*
 * Student Name: Nikhil Gupta
 * Student ID : BCS2025498
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 15, Question: 2
 */

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i).append(",");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
