package practice.hibernate52.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import practice.hibernate52.dao.FolderDao;
import practice.hibernate52.service.FolderService;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class FolderServiceImpl2 implements FolderService{

    @Resource
    @Qualifier("folderDaoImpl2")
    private FolderDao folderDao;

    @Override
    public <T> List<T> get(Class<T> tClass) {
        return folderDao.get(tClass);
    }
}
