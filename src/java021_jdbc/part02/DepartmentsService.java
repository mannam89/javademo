package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

public class DepartmentsService {
	DepartmentsDAO dao = null;

	public DepartmentsService() {

	}

	public List<DepartmentsDTO> getDepartmentsList() {
		List<DepartmentsDTO> aList = null;
		Connection conn = JdbcTemplate.getConnection();
		dao = DepartmentsDAO.getInstance();

		try {
			conn.setAutoCommit(false);  //자동커밋해제
			aList = dao.getListMethod(conn);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}

		return aList;
	}// end getDepartmentsList()	
	
	
	public List<DepartmentsDTO> getSearchList(String search){
		List<DepartmentsDTO> aList = null;
		Connection conn = JdbcTemplate.getConnection();
		dao = DepartmentsDAO.getInstance();
		
		try {
			conn.setAutoCommit(false);
			aList = dao.getSearchMethod(conn, search);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
			JdbcTemplate.close(conn);
		}
		
		return aList;
	}
	
	
	
}// end class
