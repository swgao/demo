package shuzu;

import java.util.Scanner;

public class ChengJi {
	
	public static void main(String[] args) {
		int [][]scores = new int[10][3];
		String [][]lovel = new String[10][3];
		for(int i=0;i<scores.length;i++) {
			for (int j = 0; j<scores[i].length;j++) {
				System.out.println("�������"+(i+1)+"��ѧ���ĵ�"+(j+1)+"�ųɼ�");
				Scanner scan = new Scanner(System.in);
				scores[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<scores.length;i++) {
			for (int j = 0; j<scores[i].length;j++) {
				if(scores[i][j] <= 100 && scores[i][j] >= 0) {
					if(scores[i][j]>=90)
						lovel[i][j]= "����";
					else if(scores[i][j]>60)
						lovel[i][j] = "�ϸ�";
					else
						lovel[i][j] = "���ϸ�";
				}
				else
					lovel[i][j]= "������ĳɼ����Ϸ�";
	}
		}
		for(int i=0;i<scores.length;i++) {
			System.out.println("��"+(i+1)+"�ĳɼ�");
			for (int j = 0; j<scores[i].length;j++) {
				System.out.println("��"+(j+1)+"�γ�"+scores[i][j]+"�ɼ��ж�:" + lovel[i][j]);
			}
			System.out.println();
		}
			}
				}