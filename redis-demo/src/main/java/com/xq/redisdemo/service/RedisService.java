package com.xq.redisdemo.service;

public interface RedisService {
	
	public boolean set(final String key, String value);
	
	public boolean set(final String key, String value, Long expire);
	
	public Object get(final String key);
	
	public boolean exists(final String key);
	
	public boolean remove(final String key);
	
    public void remove(final String... keys);
}
