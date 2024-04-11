package world.yzd.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import world.yzd.entity.Medicine;

import java.util.List;
import java.util.Map;


@Repository
public interface MedicineDao extends BaseMapper<Medicine> {

    /**
     * 根据疾病查询药物
     */
    List<Map<String, Object>> findMedicineList(Integer illnessId);

}
