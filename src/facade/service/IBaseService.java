package facade.service;

import java.util.List;

import facade.dto.BaseDto;

public interface IBaseService {
	void batchUpdate(List<BaseDto> list);
}
