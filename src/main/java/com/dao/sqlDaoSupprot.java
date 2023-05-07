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
			list = sqlMapClient.queryForList("testSelect");
			reader.close();
			System.out.println("SqlMapClient 按眉 积己 己傍");
		} catch (IOException e) {
			System.out.println("SqlMapClient 按眉 积己 角菩");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL备巩 坷幅");
			e.printStackTrace();
		}
	}

	public static List getSqlMapClient() {
		return list;
	}
	
}
