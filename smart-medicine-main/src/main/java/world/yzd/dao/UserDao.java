package world.yzd.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import world.yzd.entity.User;


@Repository
public interface UserDao extends BaseMapper<User> {

}
