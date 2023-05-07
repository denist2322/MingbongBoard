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
			System.out.println("SqlMapClient ��ü ���� ����");
		} catch (IOException e) {
			System.out.println("SqlMapClient ��ü ���� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL���� ����");
			e.printStackTrace();
		}
	}

	public static List getSqlMapClient() {
		return list;
	}
	
}
