package creationalpatterns.abstractfactory;


//The Abstract Factory
public interface ConnectionFactory {
	Local getLocalConnection();
	Remote getRemoteConnection();
}
