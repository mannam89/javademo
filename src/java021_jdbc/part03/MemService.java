package java021_jdbc.part03;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

public class MemService {
	public MemDAO dao;

	public MemService() {
		dao = MemDAO.getInstance();
	}

	public int getDeleteProcess(int num) {
		int chk = 0;
		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false);
			chk = dao.getDeleteMethod(conn, num);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}
		return chk;
	}

	public int getUpdateProcess(HashMap<String,Object> hMap) {
		int chk = 0;
		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false);
			chk = dao.getUpdateMethod(conn, hMap);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}

		return chk;
	}

	public int getInsertProcess(MemDTO dto) {
		int chk = 0;
		Connection conn = JdbcTemplate.getConnection();

		try {
			conn.setAutoCommit(false);
			chk = dao.getInsertMethod(conn, dto);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}

		return chk;

	}

	public List<MemDTO> getListProcess() {
		List<MemDTO> aList = null;
		Connection conn = JdbcTemplate.getConnection();

		try {
			conn.setAutoCommit(false);
			aList = dao.getListMethod(conn);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}

		return aList;

	}

}
