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
					System.out.println("��������");
					break;
				case DTOStatus.UPDATE:
					System.out.println("��������");
					break;
				case DTOStatus.DELETE:
					System.out.println("ɾ������");
					break;
				default:
					break;
				}
			}
		}
	}
}
