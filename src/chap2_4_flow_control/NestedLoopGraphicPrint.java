package chap2_4_flow_control;

public class NestedLoopGraphicPrint {
	/**
	 * ����Ƕ��ѭ����ӡ�ض�ͼ��
	 * ͼ��1��
	 * 		*
	 * 		***
	 * 		*****
	 * 		*******
	 * ���������
	 * 		���ѭ�� ������4
	 * 		�ڲ�ѭ������һ��ѭ��1�Σ��ڶ���3�Σ�������5�Σ����Ĵ�7��
	 * ͼ��2��(-��ʾ�ո�)
	 * 	 ---*---
	 *   --***--
	 *   -*****-
	 *   *******
	 * ���������
	 * 		���ѭ�� ������4
	 * 		�ڲ�ѭ������Ҫ�����Ǻ���Ҫ���ƿո񡣿���������ѭ��
	 * 			�ڲ�ѭ��1�����ƿո���������һ��3�ո񣻵ڶ���2�ո񣻵�����1�ո񣻵�����0�ո�
	 * 			�ڲ�ѭ��1�������Ǻ���������һ��1*���ڶ���3*��������5*��������7*��
	 * ͼ��3��
	 *     ---*---
	 * 	   --***--
	 *     -*****-
	 *     *******
	 *     -*****-
	 *     --***--
	 *     ---*---
	 * ���������
	 * 
	 * ͼ��4��
	 *     ---*---
	 * 	   --*-*--
	 *     -*---*-
	 *     *-----*
	 *     -*---*-
	 *     --*-*--
	 *     ---*---
	 * @param args
	 */
	public static void main(String[] args) {
		//ͼ�δ�ӡ�������ص㣺�����Ƶ���������ÿִ����һ�λ�һ�У����ڲ�ѭ�����Ƶ���������������
		//ʮ��ʮ���Ǻ�
		for(int i =0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//ͼ��1
		for(int i =0;i<4;i++) {
			//i:0 1 2 3
			//j:��Ӧi*2+1
			for(int j =0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//ͼ��2
		for(int i =0;i<4;i++) {
			//i:0 1 2 3
			//j�ո��� 3 2 1 0
			for(int j=i+1;j<4;j++) {
				System.out.print(" ");
			}
			//k�ǺŶ�Ӧi*2+1
			for(int k = 0;k<i*2+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//ͼ��3
		//ͼ��4
	}

}