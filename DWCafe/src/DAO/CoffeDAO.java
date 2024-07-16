package DAO;

import java.util.HashMap;

import DTO.Coffe;

public class CoffeDAO extends ParentDAO{

	public HashMap<Integer,Coffe> findAll(){
		HashMap<Integer,Coffe> data=new HashMap<>();
		String sql="select * from coffe";
// coffe �ڿ� order by price [ desc(��������) / asc(��������) ]
// ������ �̸� �ϸ� �������� ������ �ʿ䰡 ��� ���ϴ�.
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery();
// select-executeQuery  / insert update delete - executeUpdate
			while(rs.next()) {
// rs.get������Ÿ��("�÷���") �÷��� ��� �÷� ��ġ ��ȣ�� �ȴ�. ���� price�� 3��° �̹Ƿ� rs.get������Ÿ��(3)
				data.put(rs.getInt("coffe_id"), new Coffe(rs.getString("item_name"), rs.getInt("price"),rs.getBoolean("decaffein")));
			}
		}catch(Exception e) {
			System.out.println("Ŀ�� ��� ��ȸ ����");
		}
		return data;
	}
}
