package world.yzd.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import world.yzd.dao.MedicalNewsDao;
import world.yzd.entity.MedicalNews;
import world.yzd.utils.Assert;
import world.yzd.utils.BeanUtil;
import world.yzd.utils.VariableNameUtils;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


@Service
public class MedicalNewsService extends BaseService<MedicalNews> {

    @Autowired
    protected MedicalNewsDao medicalNewsDao;

    @Override
    public List<MedicalNews> query(MedicalNews o) {
        QueryWrapper<MedicalNews> wrapper = new QueryWrapper();
        if (Assert.notEmpty(o)) {
            Map<String, Object> bean2Map = BeanUtil.bean2Map(o);
            for (String key : bean2Map.keySet()) {
                if (Assert.isEmpty(bean2Map.get(key))) {
                    continue;
                }
                wrapper.eq(VariableNameUtils.humpToLine(key), bean2Map.get(key));
            }
        }
        return medicalNewsDao.selectList(wrapper);
    }

    @Override
    public List<MedicalNews> all() {
        return query(null);
    }

    @Override
    public MedicalNews save(MedicalNews o) {
        if (Assert.isEmpty(o.getId())) {
            medicalNewsDao.insert(o);
        } else {
            medicalNewsDao.updateById(o);
        }
        return medicalNewsDao.selectById(o.getId());
    }

    @Override
    public MedicalNews get(Serializable id) {
        return medicalNewsDao.selectById(id);
    }

    @Override
    public int delete(Serializable id) {
        return medicalNewsDao.deleteById(id);
    }
}