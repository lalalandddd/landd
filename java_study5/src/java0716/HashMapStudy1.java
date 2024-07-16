package java0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy1 {

	public static void main(String[] args) {

		HashMap<String,Integer> map=new HashMap<>();
//		map.put("�̼���",19990405); map.put("�庸��",19880702);
//		map.put("������",19990101); map.put("�念��",20110718);
		map.put("�̵�",20051103); map.put("����ȯ",19701129);
		map.put("Ȳ��",19920814); map.put("�ͻ缺",19930630);
		map.put("������",20090101);  // key �ߺ� �� ��(���߰͸� ����-���)
		map.put("�̼���",19701129);  // value �ߺ� ��
		System.out.println(map);
		map.putIfAbsent("����ȯ",1222);  // map�� key�� �����Ѵٸ� ���� ����
		map.putIfAbsent("��������",19880317);  // key�� ���ٸ� ����
		System.out.println(map);
		System.out.println(map.get("�̵�"));  // key�� ������ value�� ���
		map.replace("�̼���",19760505);  // ����
		System.out.println(map);
		System.out.println(map.containsKey("��������")+" "+map.containsKey("����ȣ"));  // key Ȯ��
		System.out.println(map.containsValue(1222)+" "+map.containsValue(20051103));  // value Ȯ��
		System.out.println(map.isEmpty());  // ����ִ��� Ȯ��
		System.out.println(map.size());  // ũ�� Ȯ��
		Set<String> keys=map.keySet();  // set �Ǵ� collection ��ȯ
		System.out.println(keys);
		for(String name:keys) {  // �ݺ��� �Ἥ ��� ����Ϸ��� set ��ȯ �� �̷��� �����߸� �Ѵ�.
			System.out.println(map.get(name));
		}
		List<Integer> birth=new ArrayList<>(map.values());
		System.out.println(birth);
		Set<Map.Entry<String,Integer>> entry=map.entrySet();
		System.out.println(entry);  // key=value ������ �迭�� ��ȯ
		map.forEach((k,v)->System.out.println(k+" "+v));

	}
}
/*
HashMap
 - ���������� ������� �ʴ´�.
 - key : value (javascript�� �Է� ����� ����.)
 - key�� �ߺ��� ������� �ʴ´�. value�� �ߺ� ����
 - Map�� ���� �˻��� Ưȭ�Ǿ��ִ�. (��� �޸� ������ ���� �Һ��Ѵ�.)
*/