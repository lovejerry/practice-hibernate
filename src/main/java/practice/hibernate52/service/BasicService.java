package practice.hibernate52.service;

import java.util.List;

public interface BasicService {
    <T> T get(Class<T> tClass, long id);
    <T> List<T> get(Class<T> tClass);
    <T> List<T> get(Class<T> tClass, List ids);

    <T> List<T> get(String hql);
}
