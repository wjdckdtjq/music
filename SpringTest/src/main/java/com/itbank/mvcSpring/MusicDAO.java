package com.itbank.mvcSpring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class MusicDAO {
	
	DBConnectionMgr pool;
	Connection con;

	public MusicDAO() {
		// TODO Auto-generated constructor stub
		pool = DBConnectionMgr.getInstance();
	}
	
	   public void insert(MusicDTO dto) throws Exception {
		   // 1. SQL 쿼리 준비
		   String sql = "insert into music values(?,?,?,?)";
		   // 2. 연결하기
		   con = pool.getConnection();
		   PreparedStatement pstmt = con.prepareStatement(sql);
		   // 3. 데이터 binding
		   pstmt.setString(1, dto.getId());
		   pstmt.setString(2, dto.getName());
		   pstmt.setString(3, dto.getPrice());
		   pstmt.setString(4, dto.getSinger());
		  
		   // 4. 쿼리 실행 및 결과 처리
		   pstmt.executeUpdate();
		   
		   pool.freeConnection(con, pstmt);
	   }
	   
	   public void delete(String id) throws Exception {
		   
		   String sql = "delete from music where id='" + id + "'";
		   
		   con = pool.getConnection();
		   PreparedStatement pstmt = con.prepareStatement(sql);
		   
		   pstmt.executeUpdate();
		   
		   pool.freeConnection(con, pstmt);
	   }
	   
}

