package me.study;

public class SungJukStudy {
	
	public int[] getRank(int[] jumsu) {
		int cnt = 1; // 기준값보다 큰값이 있으면 그 갯수를 카운트해서 순위를 구한다.
		int[] rank = null;
		rank = new int[jumsu.length];
		
		for(int i=0; i<jumsu.length; i++) { // i = 나(기준)
			for(int j=0; j<jumsu.length; j++) { // j = 반친구들
				if(jumsu[i] < jumsu[j]) {
					cnt++;
				}
			}
			rank[i] = cnt;
//			System.out.println(cnt);
			cnt = 1;
		}
		return rank;
	}
}
