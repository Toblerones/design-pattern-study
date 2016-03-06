package creationalpatterns.factorymethod;

public interface Display {
	//load a file
	public void load(String fileName);

	//parse the file and make a consistent data type
	public void formatConsistency();
}
