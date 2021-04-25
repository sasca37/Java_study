package generic_collection.collection.set;

import java.util.TreeSet;

public class Treeset_Prac {
	/*
	 * 이진트리의 모든 노드를 방문하는 방법을 순회라고함. 
	 * 중위순회 : 왼 부 오 
	 * 전위순회: 부 왼 오 
	 * 후위순회 : 왼오부 
	 * 레벨순회 : 부모노드,  부모노드에서 깊이가 1인 노드, ~~
	 */
	
	public static void main(String[] args) {
		var trs = new TreeSet<String>();
		trs.add("tt3");
		trs.add("tt");
		trs.add("tt2");
		if(!trs.contains("tt4")) trs.add("tt4없음");
		trs.forEach(System.out::println);
	}
}
