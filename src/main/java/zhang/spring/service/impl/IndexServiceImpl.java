package zhang.spring.service.impl;

import org.springframework.stereotype.Service;
import zhang.spring.dao.IndexDao;
import zhang.spring.service.IndexService;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    // @Autowired
    // private IndexMapper indexMapper;

    @Override
    public List<IndexDao> getIndexDao() {
        //return indexMapper.getIndexList();
        return null;
    }
}
