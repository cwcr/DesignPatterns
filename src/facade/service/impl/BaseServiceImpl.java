package facade.service.impl;

import java.util.List;

import facade.dto.BaseDto;
import facade.dto.DTOStatus;
import facade.service.IBaseService;

public class BaseServiceImpl implements IBaseService{
	@Override
	public void batchUpdate(List<BaseDto> list) {
		if(list!=null && list.size()>0) {
			for (BaseDto baseDto : list) {
				switch (baseDto.get__status()) {
				case DTOStatus.NEW:
					System.out.println("插入数据");
					break;
				case DTOStatus.UPDATE:
					System.out.println("更新数据");
					break;
				case DTOStatus.DELETE:
					System.out.println("删除数据");
					break;
				default:
					break;
				}
			}
		}
	}
}
