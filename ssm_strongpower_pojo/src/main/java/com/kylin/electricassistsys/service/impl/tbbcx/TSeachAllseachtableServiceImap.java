package com.kylin.electricassistsys.service.impl.tbbcx;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tbbcx.TSeachAllseachtableDao;
import com.kylin.electricassistsys.pojo.tbbcx.TSeachAllseachtable;
import com.kylin.electricassistsys.service.tbbcx.TSeachAllseachtableService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TSeachAllseachtableServiceImap extends ServiceImpl<TSeachAllseachtableDao, TSeachAllseachtable> implements TSeachAllseachtableService {

}
