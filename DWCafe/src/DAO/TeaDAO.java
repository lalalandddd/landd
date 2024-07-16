package DAO;

import java.util.HashMap;

import DTO.Tea;

public class TeaDAO extends ParentDAO{

	public HashMap<Integer,Tea> findAll(){
		HashMap<Integer,Tea> data=new HashMap<>();	
		String sql="select * from tea";
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery();
			while(rs.next()) {
				data.put(rs.getInt("tea_id"), new Tea(rs.getString("item_name"), rs.getInt("price")));
			}
		}catch(Exception e) {
			System.out.println("Ƽ ��� ��ȸ ����");
		}
		return data;
	}
}
