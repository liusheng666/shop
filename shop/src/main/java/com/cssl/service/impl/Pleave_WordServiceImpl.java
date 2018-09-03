package com.cssl.service.impl;

import com.cssl.dao.Pleave_WordDao;
import com.cssl.pojo.Pleave_Word;
import com.cssl.service.Pleave_WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Pleave_WordServiceImpl implements Pleave_WordService {
    @Autowired
    private Pleave_WordDao pleave_wordDao;
    @Override
    public Pleave_Word pw(Map<String, Object> map) {
        return pleave_wordDao.pw(map);
    }

    @Override
    public int pwCount(int pid) {
        return pleave_wordDao.pwCount(pid);
    }

    @Override
    public Map<String, Object> pwMap(Map<String,Object> map) {
        return pleave_wordDao.pwMap(map);
    }

    @Override
    public int pwCounts(int pid) {
        return pleave_wordDao.pwCounts(pid);
    }
}
