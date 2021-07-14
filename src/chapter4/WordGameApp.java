package chapter4;
import java.util.Scanner;

//끝말잇기 게임

import java.util.Arrays;

import java.util.Scanner;

class Player{
    Scanner inputword = new Scanner(System.in);
    public String name; 
    public String wordin;
    
    
    public String sayWord() { 
        wordin = inputword.next(); 
        return wordin;
    }
    
    public boolean succeed(char lastChar) { 
        if (lastChar == wordin.charAt(0)) return true;
        else return false;
    }
}
 
 
public class WordGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "아버지"; 
        
        System.out.println("게임에 참가하는 인원은 몇명입니까? >> ");
        int number = scanner.nextInt();
        
        Player[] play = new Player[number];
        
        for(int i=0; i<number; i++) {
            System.out.println("참가자의 이름을 입력하세요 >> ");
            play[i] = new Player(); 
            play[i].name = scanner.next();
            
        }
        System.out.println("시작하는 단어는 아버지입니다.");
        
        int i = 0, j = 0;
        while(true) {
            j = i % number; 
            int lastIndex = word.length()-1; 
            char lastChar = word.charAt(lastIndex); 
            
            System.out.print(play[j].name + " >> ");
            play[j].sayWord(); 
            boolean continuing = play[j].succeed(lastChar);
            if(continuing == false) {
                System.out.println(play[j].name + "이 졌습니다.");
                break;
            }
            word = play[j].wordin;
            i++;
        }
    }
 
}
