package facade;

import java.util.ArrayList;
import java.util.List;

import facade.controller.BaseController;
import facade.dto.BaseDto;
import facade.dto.DTOStatus;

public class FacadeMain {
	public static void main(String[] args) {
		List<BaseDto> list = new ArrayList<>();
		
		list.add(new BaseDto(DTOStatus.NEW));
		list.add(new BaseDto(DTOStatus.DELETE));
		list.add(new BaseDto(DTOStatus.UPDATE));
		
		new BaseController().update(list);
	}
}
