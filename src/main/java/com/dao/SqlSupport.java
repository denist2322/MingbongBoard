package com.dao;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlSupport {
	
	protected static SqlMapClient sqlMapper;
	static String path = "/ibatis/SqlMapConfig.xml";
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader(path);
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}
