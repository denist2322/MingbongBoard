package com.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.*;

public class sqlDaoSupprot {
	
	private static SqlMapClient sqlMapClient;
	private static List list;
	
	static {
		String path = "/ibatis/SqlMapConfig.xml";
		try {
			Reader reader = Resources.getResourceAsReader(path);
			sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
//			sqlMapClient.insert("testSelect");
//			list = sqlMapClient.queryForObject();
			list = sqlMapClient.queryForList("boardSelect");
//			list = sqlMapClient.queryForList("testSelect");
			reader.close();
			System.out.println("SqlMapClient 객체 생성 성공");
			System.out.println(list);
		} catch (IOException e) {
			System.out.println("SqlMapClient 객체 생성 실패");
			e.printStackTrace();
		} 
		catch (SQLException e) {
			System.out.println("SQL구문 오류");
			e.printStackTrace();
		}
	}

	public static List getSqlMapClient() {
		return list;
	}

//	public static List getBoardAll(String key) {
//		List result;
//		String Url = "/ibatis/SqlMapConfig.xml";
//			try {
//				Reader reader = Resources.getResourceAsReader(Url);
//				sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
//				result = sqlMapClient.queryForList(key);
//				reader.close();
//				System.out.println(result);
//				return result;
//			} catch (IOException e) {
//				System.out.println("SqlMapClient 객체 생성 실패");
//				e.printStackTrace();
//				return null;
//			} catch (SQLException e) {
//				System.out.println("SQL구문 오류");
//				e.printStackTrace();
//				return null;
//			}
//		}
	
}
