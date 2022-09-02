package com.fdmgroup.iwish.dao;

import com.fdmgroup.iwish.model.IStorable;

public interface IEditable<T extends IStorable> {
	public T update(T t);
}
