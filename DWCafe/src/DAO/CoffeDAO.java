package DAO;

import java.util.HashMap;

import DTO.Coffe;

public class CoffeDAO extends ParentDAO{

	public HashMap<Integer,Coffe> findAll(){
		HashMap<Integer,Coffe> data=new HashMap<>();
		String sql="select * from coffe";
// coffe 뒤에 order by price [ desc(내림차순) / asc(오름차순) ]
// 정렬을 미리 하면 가져가서 정렬할 필요가 없어서 편하다.
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery();
// select-executeQuery  / insert update delete - executeUpdate
			while(rs.next()) {
// rs.get데이터타입("컬럼명") 컬럼명 대신 컬럼 위치 번호도 된다. 예로 price는 3번째 이므로 rs.get데이터타입(3)
				data.put(rs.getInt("coffe_id"), new Coffe(rs.getString("item_name"), rs.getInt("price"),rs.getBoolean("decaffein")));
			}
		}catch(Exception e) {
			System.out.println("커피 목록 조회 실패");
		}
		return data;
	}
}
