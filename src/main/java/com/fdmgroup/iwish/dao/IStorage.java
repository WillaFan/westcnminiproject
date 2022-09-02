package com.fdmgroup.iwish.dao;

import java.util.List;

import com.fdmgroup.iwish.model.IStorable;

public interface IStorage<T extends IStorable> {
	public T create(T t);
	public T findById(int id);
	public List<T> findAll();
}
