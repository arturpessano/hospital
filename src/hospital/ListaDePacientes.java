package hospital;
import java.util.ArrayList;

public class ListaDePacientes {

	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	
	public void cadastrar(Paciente paciente) {
		if (paciente != null) {
			pacientes.add(paciente);
		}
	}
			
	public void remover(Paciente paciente) {
	pacientes.removeIf((elemento) -> elemento.getNomeCompleto().equals(paciente.getNomeCompleto()));
	}
	public Paciente buscar(Paciente paciente) {
		for(Paciente elemento : this.pacientes) {
			if(elemento.getNomeCompleto() == paciente.getNomeCompleto()) {
				return elemento;
			}
		}
		return null;
	}
	
	public void editar(Paciente paciente) {
		int indice = pacientes.indexOf(this.buscar(paciente));
		if(indice != -1) {
			pacientes.set(indice, paciente);
		}
		
}
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for (Paciente paciente : this.pacientes) {
			builder.append(paciente.toString());

		}
		return builder.toString();
	}
}
	

