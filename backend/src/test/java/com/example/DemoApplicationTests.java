package com.example;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.UserDao;
import com.example.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	UserDao userDao;

	@Test
	void contextLoads() {
		IPage page = new Page(1,2);
		userDao.selectPage(page,null);
		System.out.println(page.getCurrent());
		System.out.println(page.getSize());
		System.out.println(page.getPages());
		System.out.println(page.getTotal());
		System.out.println(page.getRecords());
	}

}
