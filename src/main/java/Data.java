import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named
public class Data {
	
	private String dataHello = "Hello CDI";
	private int[] array = {1,2,3};

	public String getDataHello() {
		return dataHello;
	}

	public void setDataHello(String dataHello) {
		this.dataHello = dataHello;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
	

}
