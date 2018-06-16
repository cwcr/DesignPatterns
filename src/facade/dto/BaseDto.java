package facade.dto;

public class BaseDto {
	private String __status;
	
	public BaseDto(String __status) {
		this.__status = __status;
	}
	
	public String get__status() {
		return __status;
	}
	
	public void set__status(String __status) {
		this.__status = __status;
	}
}
