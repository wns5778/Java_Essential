package chapter4;
import java.util.Scanner;

//�����ձ� ����

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
        String word = "�ƹ���"; 
        
        System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�? >> ");
        int number = scanner.nextInt();
        
        Player[] play = new Player[number];
        
        for(int i=0; i<number; i++) {
            System.out.println("�������� �̸��� �Է��ϼ��� >> ");
            play[i] = new Player(); 
            play[i].name = scanner.next();
            
        }
        System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
        
        int i = 0, j = 0;
        while(true) {
            j = i % number; 
            int lastIndex = word.length()-1; 
            char lastChar = word.charAt(lastIndex); 
            
            System.out.print(play[j].name + " >> ");
            play[j].sayWord(); 
            boolean continuing = play[j].succeed(lastChar);
            if(continuing == false) {
                System.out.println(play[j].name + "�� �����ϴ�.");
                break;
            }
            word = play[j].wordin;
            i++;
        }
    }
 
}
