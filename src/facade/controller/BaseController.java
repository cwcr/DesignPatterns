package facade.controller;

import facade.dto.BaseDto;
import java.util.List;

import facade.service.IBaseService;
import facade.service.impl.BaseServiceImpl;

public class BaseController {
	private IBaseService baseService = new BaseServiceImpl();

	public void update(List<BaseDto> list) {
		baseService.batchUpdate(list);
	}
}
