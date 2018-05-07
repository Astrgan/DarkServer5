import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named
public class Data {
	
	private String dataHello = "Hello CDI";
	private String[] array = {"Title1","Title2","Title3","Title2","Title3","Title2","Title3","Title2","Title3","Title2","Title3"};

	public String getDataHello() {
		return dataHello;
	}

	public void setDataHello(String dataHello) {
		this.dataHello = dataHello;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}
	
	

}
