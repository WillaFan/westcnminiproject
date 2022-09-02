package com.fdmgroup.iwish.dao;

import com.fdmgroup.iwish.model.IStorable;

public interface IRemovable<T extends IStorable> {
	public boolean remove(T t);
}
