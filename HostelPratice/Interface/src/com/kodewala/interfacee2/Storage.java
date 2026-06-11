package com.kodewala.interfacee2;

public interface Storage {
void save(String data);
default void saveEncrypted(String data) {}
static void encrypt(String data) {}
}

class FileStorage implements Storage{
	@Override
	public void save(String data) {
		System.out.println(data);
	}
}