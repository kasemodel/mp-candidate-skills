package com.kasemodel.test.data.dao;

import com.kasemodel.test.vo.User;

public interface DefaultDao<T> {

	public T save(User user);

}
