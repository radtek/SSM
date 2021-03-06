package com.kylin.electricassistsys.server.impl.tsbsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjBdzxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjBdzxxSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxx;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxxSel;
import com.kylin.electricassistsys.service.tsbsj.TSbsjBdzxxService;
import com.kylin.electricassistsys.data.api.jcsj.TSbsjBdzxxDataApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
@Service
public class TSbsjBdzxxDataServerImpl implements TSbsjBdzxxDataApi {
    @Autowired
    private TSbsjBdzxxService tSbsjBdzxxService;


    public List<TSbsjBdzxxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSbsjBdzxx());
        return MyBeanUtils.copyPropertiesList(tSbsjBdzxxService.selectList(entityWrapper), TSbsjBdzxxDto.class);
    }

    public Page<TSbsjBdzxxSelDto> getAllList(Page page, TSbsjBdzxxSelDto tSbsjBdzxxSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TSbsjBdzxxSel tSbsjBdzxxSel = new TSbsjBdzxxSel();
        MyBeanUtils.copyProperties(tSbsjBdzxxSelDto, tSbsjBdzxxSel);
        entityWrapper.setEntity(tSbsjBdzxxSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tSbsjBdzxxSel);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TSbsjBdzxxSel());
        MyBeanUtils.toPageBean(tSbsjBdzxxService.selectPage(pagepojo, entityWrapper), page, tSbsjBdzxxSelDto);
        return page;
    }

    /*public Page<TSbsjBdzxxDto> getAllList() {
        return MyBeanUtils.copyPropertiesList(tSbsjBdzxxService.getList(), TSbsjBdzxxSelDto.class);
    }*/

    public void update(TSbsjBdzxxDto tSbsjBdzxxDto) {
        TSbsjBdzxx tSbsjBdzxx = new TSbsjBdzxx();
        MyBeanUtils.copyProperties(tSbsjBdzxxDto, tSbsjBdzxx);
        tSbsjBdzxxService.updateById(tSbsjBdzxx);
    }

    public void insert(TSbsjBdzxxDto tSbsjBdzxxDto) {
        TSbsjBdzxx tSbsjBdzxx = new TSbsjBdzxx();
        MyBeanUtils.copyProperties(tSbsjBdzxxDto, tSbsjBdzxx);
        tSbsjBdzxxService.insert(tSbsjBdzxx);
    }

    public void delete(String id) {
        tSbsjBdzxxService.deleteById(id);
    }

    public Page<TSbsjBdzxxDto> getPages(Page<TSbsjBdzxxDto> page, TSbsjBdzxxDto tSbsjBdzxxDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TSbsjBdzxx tSbsjBdzxx = new TSbsjBdzxx();
        MyBeanUtils.copyProperties(tSbsjBdzxxDto, tSbsjBdzxx);
        entityWrapper.setEntity(tSbsjBdzxx);
        Page<TSbsjBdzxx> pagepojo = new Page<TSbsjBdzxx>();
        MyBeanUtils.toPageBean(page, pagepojo, new TSbsjBdzxx());
        MyBeanUtils.toPageBean(tSbsjBdzxxService.selectPage(pagepojo, entityWrapper), page, new TSbsjBdzxxDto());
        return page;
    }
}
